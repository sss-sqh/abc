package com.bos.service.impl;

import com.bos.dao.UserMapper;
import com.bos.pojo.User;
import com.bos.pojo.UserExample;
import com.bos.service.UserService;
import com.bos.utils.ConstantUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public PageInfo<User> findAll(Integer pageNo, Integer pageSize, HttpSession session) {

        if(session.getAttribute("adminUser") != null){
            PageHelper.startPage(pageNo,pageSize);
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andRoleEqualTo("1");
            List<User> userList = userMapper.selectByExample(example);
            PageInfo<User> page = new PageInfo<>(userList, ConstantUtils.NAVIGATE_PAGENUM);
            return page;
        }else{
            return new PageInfo<>(null,ConstantUtils.NAVIGATE_PAGENUM);
        }
    }

    /**
     * 添加用户信息
     * @param user
     * @param code
     * @param session
     * @return
     */
    @Override
    public int addUser(User user, String code, HttpSession session) {
        String phoneCode = (String)session.getAttribute("phoneCode");
        session.removeAttribute("phoneCode");
        System.out.println("session中的内容："+session.getAttribute("phoneCode"));
        String phone = user.getPhone();
        String inputPhoneCode = phone +"#"+code;
        int result = 0;
        if(inputPhoneCode.equals(phoneCode)){
            //设置创建时间
            user.setCreatedTime(new Date());
            //设置修改时间
            user.setUpdatedTime(new Date());
            //设置角色 默认为1普通的货主 2为司机用户
            user.setRole("1");
            user.setStatus("1");
            result = userMapper.insert(user);
        }
        return result;
    }

    /**
     * 根据用户名和密码查询用户信息
     * @param user
     * @return
     */
    @Override
    public User findOne(User user){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(user.getUsername());
        criteria.andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);
        if(users.size() > 0){
//            System.out.println(users.get(0));
            return users.get(0);
        }else {
            return null;
        }
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public int editUser(User user) {
        user.setUpdatedTime(new Date());
        return userMapper.updateByPrimaryKeySelective(user);
    }
}

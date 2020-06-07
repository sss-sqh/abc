package com.bos.service;


import com.bos.pojo.User;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpSession;

public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    public PageInfo<User> findAll(Integer pageNo, Integer pageSize, HttpSession session);

    /**
     * 添加用户信息
     * @param user
     * @param code
     * @param session
     * @return
     */
    public int addUser(User user, String code, HttpSession session);

    /**
     * 根据用户名和密码查询用户信息
     * @param user
     * @return
     */
    public User findOne(User user);

    /**
     * 修改用户信息
     * @param user
     */
    public int editUser(User user);
}

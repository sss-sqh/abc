package com.bos.controller;

import com.bos.pojo.User;
import com.bos.service.UserService;
import com.bos.utils.Result;
import com.bos.utils.SendSms;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查找所有用户
     * @return
     */
    @RequestMapping("/findAll")
    public PageInfo<User> findAll(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                                  @RequestParam(value = "pageSize",defaultValue = "4")Integer pageSize,
                                  HttpSession session){
        PageInfo<User> page = userService.findAll(pageNo, pageSize, session);
        return page;
    }

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addUser(@RequestBody User user,@RequestParam("code") String code,HttpSession session){
        //输出从前端获取到的数据
//        System.out.println(user);
        if(userService.addUser(user,code,session) > 0){
            return new Result(true,"注册成功！");
        }else {
            return new Result(false,"注册失败,验证码错误！");
        }
    }

    @RequestMapping("/findOne")
    public Result findOne(@RequestBody User user, HttpSession session){
        User loginUser = userService.findOne(user);
//        System.out.println("Controller的loginUser"+ loginUser);
        HashMap<String, Object> map = new HashMap<>();
        if(loginUser != null){
            if(loginUser.getRole().equals("0")){
                session.setAttribute("adminUser",loginUser);
                map.put("adminUser",loginUser);
            }else {
                //将查询到的用户信息存入到session中
                session.setAttribute("loginUser",loginUser);
                map.put("loginUser",loginUser);
            }
//            System.out.println(map.get("loginUser"));
            Result result = new Result(true, "登录成功！", map);
            System.out.println(result);
            return result;
        }else {
            return  new Result(false,"用户名或密码错误！");
        }
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @RequestMapping("/editUser")
    public Result editUser(@RequestBody User user,HttpSession session){
        if(userService.editUser(user) > 0){
            User updateUser = userService.findOne(user);
            session.setAttribute("loginUser",updateUser );
            return new Result(true,"修改成功！");
        }else {
            return new Result(false,"修改失败！");
        }
    }


    /**
     * 获取session中存的登录用户信息
     * @param session
     * @return
     */
    @RequestMapping("/getSessionLoginUser")
    public User getSessionLoginUser(HttpSession session){
        return (User)session.getAttribute("loginUser");
    }

    @RequestMapping("/cleanSessionLoginUser")
    public Result cleanSessionLoginUser(HttpSession session){
        session.removeAttribute("loginUser");
        return new Result(true,"注销成功！");
    }

    /**
     * 获取session中存的登录用户信息
     * @param session
     * @return
     */
    @RequestMapping("/getSessionAdminUser")
    public User getSessionAdminUser(HttpSession session){
        return (User)session.getAttribute("adminUser");
    }

    @RequestMapping("/cleanSessionAdminUser")
    public Result cleanSessionAdminUser(HttpSession session){
        session.removeAttribute("adminUser");
        return new Result(true,"注销成功！");
    }

    /**
     * 发送验证码
     * @param phone
     * @param session
     * @return
     */
    @RequestMapping("/sendCode")
    public Result sendCode(@RequestParam(value = "phone")String phone,HttpSession session){
        //产生随机验证码
        String code = SendSms.createCode(5);
        //发送验证码
        SendSms.sendSms(phone,code);
        //将验证码和手机号组合起来，存入到session中
        String phoneCode = phone +"#"+ code;
        System.out.println(phoneCode);
        session.setAttribute("phoneCode",phoneCode);
        return new Result(true,"验证码发送成功！");
    }

}

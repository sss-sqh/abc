package com.bos.controller;

import com.bos.pojo.NewCar;
import com.bos.pojo.NewInfo;
import com.bos.pojo.User;
import com.bos.service.NewCarService;
import com.bos.utils.ConstantUtils;
import com.bos.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/newCar")
public class NewCarController {
    @Autowired
    private NewCarService newCarService;

    @RequestMapping("/getAllNewCar")
    public PageInfo<NewCar> getAllNewCar(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                                         @RequestParam(value = "pageSize",defaultValue = "4")Integer pageSize,
                                         HttpServletRequest request, HttpSession session){
        Map<String, Object> paramMap = WebUtils.getParametersStartingWith(request, "search_");
        PageInfo<NewCar> page = newCarService.getAllNewCar(pageNo,pageSize,paramMap,session);
        return page;
    }


    @RequestMapping("/adminGetAllNewCar")
    public PageInfo<NewCar> adminGetAllNewCar(@RequestParam(value = "pageNo",defaultValue = "1") Integer pageNo,
                                         @RequestParam(value = "pageSize",defaultValue = "4")Integer pageSize,
                                         HttpServletRequest request, HttpSession session){
        Map<String, Object> paramMap = WebUtils.getParametersStartingWith(request, "search_");
        PageInfo<NewCar> page = newCarService.adminGetAllNewCar(pageNo,pageSize,paramMap,session);
        return page;
    }

    @RequestMapping("/access")
    public Result access(@RequestBody NewCar newCar,HttpSession session){
        if(newCarService.access(newCar) > 0){

//            User loginUser = (User)session.getAttribute("loginUser");
//            loginUser.setRole("2");
//            session.setAttribute("loginUser",loginUser);

            return  new Result(true,"审核通过！");
        }else{
            return new Result(false,"审核未通过！");
        }
    }

    @RequestMapping("/stop")
    public Result stop(@RequestBody NewCar newCar){
        if(newCarService.stop(newCar) > 0){
            return  new Result(true,"审核通过！");
        }else{
            return new Result(false,"审核未通过！");
        }
    }
}

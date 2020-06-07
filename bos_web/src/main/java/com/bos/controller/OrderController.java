package com.bos.controller;

import com.bos.pojo.NewInfo;
import com.bos.pojo.NewOrders;
import com.bos.pojo.User;
import com.bos.service.OrderService;
import com.bos.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/saveOrder")
    public Result saveOrder(@RequestBody NewInfo newInfo, HttpSession session){
        User carUser = (User) session.getAttribute("loginUser");
        if(orderService.saveOrder(newInfo,carUser) > 0){
            return new Result(true,"恭喜你！您已成功接单！");
        }else {
            return new Result(false,"接单失败！");
        }
    }

    @RequestMapping("/getPersonalOrder")
    public PageInfo<NewOrders> getPersonalOrder(HttpSession session, @RequestParam(value = "pageNo",defaultValue = "1") int pageNo){
        User loginUser = (User)session.getAttribute("loginUser");
        return orderService.getPersonalOrder(loginUser,pageNo);
    }
/*
    @RequestMapping("/finishOrder")
    public Result finishOrder(@RequestBody NewOrders orderInfo){

//        System.out.println(orderInfo);
//        if(orderService.finishOrder(oid,cid) > 0){


        if(orderService.finishOrder(orderInfo) > 0){
            return new Result(true,"您已成功完成这次的运输订单，欢迎下次下单！");
        }else {
            return new Result(false,"您的订单出现了问题！");
        }
    }*/

    @RequestMapping("/finishOrder")
    public Result finishOrder(@RequestParam(value = "oid") String oid,
                              @RequestParam(value = "cid") Long cid,
                              @RequestParam(value = "carCreatedTime") String carCreatedTime,
                              @RequestParam(value = "oCreatedTime") String oCreatedTime ){
//        System.out.println(oid+"....."+cid+"....."+carCreatedTime+"....."+oCreatedTime);
        if(orderService.finishOrder(oid,cid,carCreatedTime,oCreatedTime) > 0){
            return new Result(true,"您已成功完成这次的运输订单，欢迎下次下单！");
        }else {
            return new Result(false,"您的订单出现了问题！");
        }
    }

    @RequestMapping("/getOrderById")
    public Result getOrderById(@RequestParam(value = "oid") Long oid){
        Map<String, Object> map = new HashMap<>();
        NewOrders newOrder = orderService.getOrderById(oid);
        if(newOrder != null){
            map.put("order",newOrder);
            return new Result(true,"恭喜你，订单查询到！",map);
        }else {
            return new Result(false,"抱歉没有此订单！");
        }
    }

    @RequestMapping("/findAllOrder")
    public PageInfo<NewOrders> findAllOrder(HttpSession session,
                                            @RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
                                            @RequestParam(value = "pageSize",defaultValue = "4") int pageSize){
        User adminUser = (User)session.getAttribute("adminUser");
        return orderService.findAllOrder(pageNo,pageSize,adminUser);
    }
}

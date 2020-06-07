package com.bos.service;

import com.bos.pojo.NewInfo;
import com.bos.pojo.NewOrders;
import com.bos.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderService {
    /**
     * 保存订单
     * @param newInfo
     * @return
     */
    public int saveOrder(NewInfo newInfo, User carUser);

    /**
     * 根据登录用户id 查询用户的订单
     * @return
     */
    public PageInfo<NewOrders> getPersonalOrder(User loginUser,int pageNo);

    /**
     * 完成订单
     * @return
     */
//    public int finishOrder(NewOrders orderInfo);
//    public int finishOrder(Long oid,Long cid);
    public int finishOrder(String oid,Long cid,String carCreatedTime,String oCreatedTime);


    /**
     * 根据运单号，查询运单信息
     * @param oid
     * @return
     */
    public NewOrders getOrderById(Long oid);

    public PageInfo<NewOrders> findAllOrder(int pageNo, int pageSize,User adminUser);
}

package com.bos.service.impl;

import com.bos.dao.CarMapper;
import com.bos.dao.InfoMapper;
import com.bos.dao.OrdersMapper;
import com.bos.dao.UserMapper;
import com.bos.pojo.*;
import com.bos.service.AddressService;
import com.bos.service.NewInfoService;
import com.bos.service.OrderService;
import com.bos.service.TypeService;
import com.bos.utils.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Autowired
    private InfoMapper infoMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private AddressService addressService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private NewInfoService newInfoService;

    @Autowired
    private IdWorker idWorker;

    /**
     * 保存订单
     * @param newInfo
     * @return
     */
    @Override
    public int saveOrder(NewInfo newInfo, User carUser) {
        Orders order = new Orders();
        Long oid = idWorker.nextId();
//        long oid = Long.parseLong(SendSms.createCode(10));
        order.setOid(oid);
        order.setInfoId(newInfo.getInfo().getIid());
        order.setInfoUser(newInfo.getInfo().getIuserId());
        order.setDriverUser(carUser.getId());
        order.setCreatedTime(new Date());
        order.setOstatus(1);
        //将货源信息改变为已接单状态
        Info info = new Info();
        info.setIid(newInfo.getInfo().getIid());
        //设置创建时间
        info.setCreatedTime(TimeUtils.stringDate2Date(newInfo.getInfo().getCreatedTime()));
        //设置修改时间
        info.setUpdatedTime(new Date());
        info.setIstatus(1);
        System.out.println("info:" + info);
        System.out.println("infoMapper" + infoMapper);
        int i = infoMapper.updateByPrimaryKeySelective(info);
        int m = ordersMapper.insert(order);
        //设置车辆状态为1-已接单  0-为待接单
//        Car car = new Car();
        CarExample example = new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andCuserEqualTo(carUser.getId());
        List<Car> cars = carMapper.selectByExample(example);
        Car car = cars.get(0);
        car.setCstatus(1);
        car.setCreatedTime(TimeUtils.stringDate2Date(car.getCreatedTime()));
        int c = carMapper.updateByExampleSelective(car, example);
        if(i > 0 && m > 0 && c >0){
            return 1;
        }
        return 0;
    }

    /**
     * 根据用户查询该用户的所有订单
     * @return
     */
    @Override
    public PageInfo<NewOrders> getPersonalOrder(User loginUser,int pageNo) {
        //设置根据登录用户查询订单
        System.out.println(loginUser);
        List<Orders> ordersList = null;
        String role = "";
        role = loginUser.getRole();
        PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);

        if( role.equals("1")){
            System.out.println("货主查询结果！");
            OrdersExample example = new OrdersExample();
            OrdersExample.Criteria criteria = example.createCriteria();
            criteria.andInfoUserEqualTo(loginUser.getId());
            ordersList = ordersMapper.selectByExample(example);
        }else{
            System.out.println("司机查询结果！");
            OrdersExample example1 = new OrdersExample();
            OrdersExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andDriverUserEqualTo(loginUser.getId());
            ordersList = ordersMapper.selectByExample(example1);
            OrdersExample example2 = new OrdersExample();
            OrdersExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andInfoUserEqualTo(loginUser.getId());
            List<Orders> ordersList2 = ordersMapper.selectByExample(example2);
            ordersList.addAll(ordersList2);
        }

        PageInfo<Orders> ordersPageInfo = new PageInfo<>(ordersList, ConstantUtils.NAVIGATE_PAGENUM);
        PageInfo<NewOrders> newOrdersPageInfo = PageUtils.PageInfo2PageInfoVo(ordersPageInfo);
//        criteria.andDriverUserEqualTo(loginUser.getId());
//        criteria.andInfoUserEqualTo(loginUser.getId());
//        List<Orders> ordersList = ordersMapper.selectByExample(example);
        List<NewOrders> newOrdersList = new ArrayList<NewOrders>();
        //遍历订单列表，根据列表中的id来查询用户信息和货源信息等
        for (Orders order:ordersList) {
            //根据订单表的信息，丰富订单信息，生成新的订单信息
            NewOrders newOrders = createNewOrder(order);

            //将各种信息添加到列表中
            newOrdersList.add(newOrders);
        }
        newOrdersPageInfo.setList(newOrdersList);
        return newOrdersPageInfo;
    }

    //根据订单表的信息，丰富订单信息，生成新的订单信息
    private NewOrders createNewOrder(Orders order){
        NewOrders newOrders = new NewOrders();
        if(order != null){
            //获取车主的id
            Long driverUserId = order.getDriverUser();
            newOrders.setDriverUser(userMapper.selectByPrimaryKey(driverUserId));
            //根据车主id查询车辆信息
            CarExample carExample = new CarExample();
            CarExample.Criteria carExampleCriteria = carExample.createCriteria();
            carExampleCriteria.andCuserEqualTo(driverUserId);
            newOrders.setCar(carMapper.selectByExample(carExample).get(0));
            //获取货主的id 并设置
            Long infoUserId = order.getInfoUser();
            newOrders.setInfoUser(userMapper.selectByPrimaryKey(infoUserId));
            //获取货源信息，并设置
            Long infoId = order.getInfoId();
            Info info = infoMapper.selectByPrimaryKey(infoId);
            List<Info> infoList = new ArrayList<>();
            infoList.add(info);
            //创建一个数组用来保存所有的地址数据
            String[] addressArray = addressService.findAddressArray();
            //创建一个数组用来保存所有的类型数据
            String[] typeArray = typeService.findTypeArray();
            List<NewInfo> newInfoList = NewInfoServiceImpl.comAddressAndType(infoList, addressArray, typeArray);
            newOrders.setNewInfo(newInfoList.get(0));
            //设置其他的属性等
            newOrders.setCreatedTime(order.getCreatedTime());
            newOrders.setOid(order.getOid());
            System.out.println("order:"+order.getOid()+"::::::::::::");
            System.out.println("newOrder:"+newOrders.getOid()+"::::::::::::");
            newOrders.setOstatus(order.getOstatus());
        }
        return newOrders;
    }

    @Override
//    public int finishOrder(NewOrders orderInfo) {
    public int finishOrder(String oid,Long cid,String carCreatedTime,String oCreatedTime) {
        //完成订单主要实现将订单表中的状态改为已完成
        Orders orders = new Orders();
//        orders.setOid(orderInfo.getOid());
        orders.setOid(Long.parseLong(oid));
        //1-已接单 2-已完成
        orders.setOstatus(2);
        orders.setCreatedTime(TimeUtils.stringDate2Date(oCreatedTime));
        int i = ordersMapper.updateByPrimaryKeySelective(orders);
        //再就是要将车辆信息表中的状态改为待接单
        Car car = new Car();
//        car.setCid(orderInfo.getCar().getCid());
        car.setCid(cid);
        car.setCreatedTime(TimeUtils.stringDate2Date(carCreatedTime));
        //0-待接单 1-已接单
        car.setCstatus(0);
        int j = carMapper.updateByPrimaryKeySelective(car);
        if(i > 0 && j > 0){
            return 1;
        }
        return 0;
    }

    /**
     * 根据运单号，查询运单信息
     * @param oid
     * @return
     */
    public NewOrders getOrderById(Long oid){
        Orders orders = ordersMapper.selectByPrimaryKey(oid);
        if(orders != null){
            NewOrders newOrder = createNewOrder(orders);
            return newOrder;
        }else {
            return null;
        }
    }

    public PageInfo<NewOrders> findAllOrder(int pageNo,int pageSize,User adminUser){
        PageHelper.startPage(pageNo,pageSize);
        List<Orders> ordersList = null;
        if(adminUser != null){
            System.out.println("管理员查询结果！");
            ordersList = ordersMapper.selectByExample(null);
        }
        PageInfo<Orders> ordersPageInfo = new PageInfo<>(ordersList, ConstantUtils.NAVIGATE_PAGENUM);
        PageInfo<NewOrders> newOrdersPageInfo = PageUtils.PageInfo2PageInfoVo(ordersPageInfo);
        List<NewOrders> newOrdersList = new ArrayList<NewOrders>();
        //遍历订单列表，根据列表中的id来查询用户信息和货源信息等
        for (Orders order:ordersList) {
            //根据订单表的信息，丰富订单信息，生成新的订单信息
            NewOrders newOrders = createNewOrder(order);

            //将各种信息添加到列表中
            newOrdersList.add(newOrders);
        }
        newOrdersPageInfo.setList(newOrdersList);
        return newOrdersPageInfo;
    }
}

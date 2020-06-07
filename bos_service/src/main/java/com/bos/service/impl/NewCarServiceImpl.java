package com.bos.service.impl;

import com.bos.dao.CarMapper;
import com.bos.dao.UserMapper;
import com.bos.pojo.Car;
import com.bos.pojo.CarExample;
import com.bos.pojo.NewCar;
import com.bos.pojo.User;
import com.bos.service.NewCarService;
import com.bos.utils.ConstantUtils;
import com.bos.utils.PageUtils;
import com.bos.utils.TimeUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class NewCarServiceImpl implements NewCarService {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有的可用的车辆信息 分页 查询
     * @return
     */
    @Override
    public PageInfo<NewCar> getAllNewCar(Integer pageNo,Integer pageSize, Map<String, Object> paramMap, HttpSession session) {
        User loginUser = (User)session.getAttribute("loginUser");
        User adminUser = (User)session.getAttribute("adminUser");
        //创建分页对象
        if(pageSize != null){
            PageHelper.startPage(pageNo, pageSize);
        }else {
            PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);
        }

        List<Car> carList = null;
        //如果这样写有问题，因为后台管理员登录的时候，前台用户也可能会登录，所以这样判断不合适，要分开
//
//        if(adminUser != null && adminUser.getRole().equals("0")){
//            carList = carMapper.selectByExample(null);
//        }else {
            //创建查询对象 可用车辆
            CarExample example = new CarExample();
            CarExample.Criteria criteria = example.createCriteria();
            criteria.andCenableEqualTo(1);
            //车辆状态为待接单的 0-待接单 1-已接单
            criteria.andCstatusEqualTo(0);
            //根据查询条件查询
            Object cweight = paramMap.get("cweight");
            if (cweight != null && cweight != "") {
                criteria.andCweightGreaterThanOrEqualTo(Integer.valueOf(cweight + ""));
            }
            //先查询出所有的可用车辆信息
            carList = carMapper.selectByExample(example);
//        }

        //将查询出的所有车辆信息存入到PageInfo对象中
        PageInfo<Car> pageInfo = new PageInfo<>(carList,ConstantUtils.NAVIGATE_PAGENUM);
        //转换PageInfo
        PageInfo<NewCar> newCarPageInfo = PageUtils.PageInfo2PageInfoVo(pageInfo);
        //再根据查询出的车辆信息中的关联用户ID来查询用户信息
        List<NewCar> newCarList = new ArrayList<NewCar>();
        for (Car car: carList) {
            NewCar newCar = new NewCar();
            User carUser = userMapper.selectByPrimaryKey(car.getCuser());
            newCar.setCar(car);
            newCar.setCarUser(carUser);
            newCarList.add(newCar);
        }
        //将newCarList信息存入到新的分页中
        newCarPageInfo.setList(newCarList);
        return newCarPageInfo;
    }


    @Override
    public PageInfo<NewCar> adminGetAllNewCar(Integer pageNo,Integer pageSize, Map<String, Object> paramMap, HttpSession session) {
        User adminUser = (User)session.getAttribute("adminUser");
        //创建分页对象
        if(pageSize != null){
            PageHelper.startPage(pageNo, pageSize);
        }else {
            PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);
        }
        List<Car> carList = null;
        if(adminUser != null && adminUser.getRole().equals("0")){
            carList = carMapper.selectByExample(null);
        }
        //将查询出的所有车辆信息存入到PageInfo对象中
        PageInfo<Car> pageInfo = new PageInfo<>(carList,ConstantUtils.NAVIGATE_PAGENUM);
        //转换PageInfo
        PageInfo<NewCar> newCarPageInfo = PageUtils.PageInfo2PageInfoVo(pageInfo);
        //再根据查询出的车辆信息中的关联用户ID来查询用户信息
        List<NewCar> newCarList = new ArrayList<NewCar>();
        for (Car car: carList) {
            NewCar newCar = new NewCar();
            User carUser = userMapper.selectByPrimaryKey(car.getCuser());
            newCar.setCar(car);
            newCar.setCarUser(carUser);
            newCarList.add(newCar);
        }
        //将newCarList信息存入到新的分页中
        newCarPageInfo.setList(newCarList);
        return newCarPageInfo;
    }
    /**
     * 审核通过
     * @param newCar
     * @return
     */
    public int access(NewCar newCar){
        Long carId = newCar.getCar().getCid();
        Long driverId = newCar.getCarUser().getId();
        Car car = new Car();
        car.setCreatedTime(TimeUtils.stringDate2Date(newCar.getCar().getCreatedTime()));
        car.setCid(carId);
        //设置车辆为待接单状态
        car.setCstatus(0);
        //设置车辆状态为启用状态
        car.setCenable(1);
        User driver = new User();
        driver.setId(driverId);
        driver.setRole("2");
        driver.setCid(carId);
        int i = userMapper.updateByPrimaryKeySelective(driver);
        int j = carMapper.updateByPrimaryKeySelective(car);
        if(i > 0 && j > 0){
            return 1;
        }else {
            return 0;
        }
    }

    /**
     * 停用
     * @param newCar
     * @return
     */
    public int stop(NewCar newCar){
        Long carId = newCar.getCar().getCid();
        Long driverId = newCar.getCarUser().getId();
        Car car = new Car();
        car.setCreatedTime(TimeUtils.stringDate2Date(newCar.getCar().getCreatedTime()));
        car.setCid(carId);
        car.setCenable(0);
        User driver = new User();
        driver.setId(driverId);
        driver.setRole("1");
        int i = userMapper.updateByPrimaryKeySelective(driver);
        int j = carMapper.updateByPrimaryKeySelective(car);
        if(i > 0 && j > 0){
            return 1;
        }else {
            return 0;
        }
    }
}

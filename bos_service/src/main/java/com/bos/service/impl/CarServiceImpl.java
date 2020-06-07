package com.bos.service.impl;

import com.bos.dao.CarMapper;
import com.bos.pojo.Car;
import com.bos.pojo.CarExample;
import com.bos.service.CarService;
import com.bos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Autowired
    private UserService userService;


    /**
     * 添加车辆信息
     * @param car
     * @return
     */
    @Override
    public int addCar(Car car) {
        car.setCreatedTime(new Date());
        car.setUpdatedTime(new Date());
        car.setCenable(0);
        int result = carMapper.insert(car);
        return result;
    }

    /**
     * 根据用户的id来查询车辆信息
     * @param cuser
     * @return
     */
    @Override
    public Car getCarByUserId(Long cuser) {
        CarExample example = new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andCuserEqualTo(cuser);
        List<Car> cars = carMapper.selectByExample(example);
        return cars.get(0);
    }

    /**
     * 修改车辆信息
     * @param car
     * @return
     */
    public int editCar(Car car){
        car.setUpdatedTime(new Date());
        return carMapper.updateByPrimaryKey(car);
    }
}

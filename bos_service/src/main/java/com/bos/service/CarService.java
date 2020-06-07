package com.bos.service;

import com.bos.pojo.Car;

public interface CarService {
    /**
     * 添加车辆信息
     * @param car
     * @return
     */
    public int addCar(Car car);

    /**
     * 根据用户的id来查询车辆信息
     * @param cuser
     * @return
     */
    public Car getCarByUserId(Long cuser);

    /**
     * 修改车辆信息
     * @param car
     * @return
     */
    public int editCar(Car car);
}

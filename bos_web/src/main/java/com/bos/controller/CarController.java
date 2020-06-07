package com.bos.controller;

import com.bos.pojo.Car;
import com.bos.pojo.User;
import com.bos.service.CarService;
import com.bos.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    /**
     * 添加车辆信息
     * @param car
     * @param session
     * @return
     */
    @RequestMapping("/addCar")
    public Result addCar(@RequestBody Car car, HttpSession session){
        User loginUser = (User) session.getAttribute("loginUser");
        car.setCuser(loginUser.getId());
        if(carService.addCar(car) > 0){
            return new Result(true,"添加成功！");
        }else {
            return new Result(false,"添加失败！");
        }
    }

    /**
     * 根据用户的id来查询车辆信息
     * @param cuser
     * @return
     */
    @RequestMapping("/getCarByUserId")
    public Car getCarByUserId(Long cuser){
        return carService.getCarByUserId(cuser);
    }

    /**
     * 修改车辆信息
     * @param car
     * @return
     */
    @RequestMapping("/editCar")
    public Result editCar(@RequestBody Car car){
        if(carService.editCar(car) > 0){
            return new Result(true,"修改成功！");
        }else {
            return new Result(false,"修改失败！");
        }
    }
}

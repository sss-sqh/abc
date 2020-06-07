package com.bos.service;

import com.bos.pojo.NewCar;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface NewCarService {
    /**
     * 查询所有的可用的车辆信息 分页 查询
     * @return
     */
    public PageInfo<NewCar> getAllNewCar(Integer pageNo,Integer pageSize, Map<String, Object> paramMap, HttpSession session);

    /**
     * 管理员查询所有的车辆信息
     * @param pageNo
     * @param pageSize
     * @param paramMap
     * @param session
     * @return
     */
    public PageInfo<NewCar> adminGetAllNewCar(Integer pageNo,Integer pageSize, Map<String, Object> paramMap, HttpSession session);

    /**
     * 审核通过
     * @param newCar
     * @return
     */
    public int access(NewCar newCar);

    public int stop(NewCar newCar);
}

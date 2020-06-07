package com.bos.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.bos.utils.TimeUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.swing.*;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NewOrders implements Serializable {
    private User driverUser;
    private User infoUser;
    private NewInfo newInfo;

//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    @JSONField(serializeUsing = ToStringSerializer.class)
//    @JsonSerialize(using = ToStringSerializer.class)
    private Long oid;
    private Integer ostatus;
    private Date createdTime;
    private Car car;

    public NewOrders(){

    }

    public NewOrders(User driverUser, User infoUser, NewInfo newInfo, Long oid, Integer ostatus, Date createdTime, Car car) {
        this.driverUser = driverUser;
        this.infoUser = infoUser;
        this.newInfo = newInfo;
        this.oid = oid;
        this.ostatus = ostatus;
        this.createdTime = createdTime;
        this.car = car;
    }

    public User getDriverUser() {
        return driverUser;
    }

    public void setDriverUser(User driverUser) {
        this.driverUser = driverUser;
    }

    public User getInfoUser() {
        return infoUser;
    }

    public void setInfoUser(User infoUser) {
        this.infoUser = infoUser;
    }

    public NewInfo getNewInfo() {
        return newInfo;
    }

    public void setNewInfo(NewInfo newInfo) {
        this.newInfo = newInfo;
    }

//    public Long getOid() {
//        return oid;
//    }

    public void setOid(Long oid) {
        this.oid = oid;
    }
//
//    public Long getOid() {
//        return oid ;
//    }

    public String getOid(){
        return oid+"";
    }

    public void setOid(String oid) {
        this.oid = Long.parseLong(oid);
    }


//    public Integer getOstatus() {
//        return ostatus;
//    }


    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }



    public String getOstatus() {
        if(ostatus.equals(1)){
            return "已接单";
        }else if (ostatus.equals(2)){
            return "已完成";
        }else {
            return "";
        }
    }

    public void setOstatusString(String ostatus) {
        if(ostatus.equals("已接单")){
            this.ostatus = 1;
        }else {
            this.ostatus = 2;
        }
    }



    public String getCreatedTime() {
        return TimeUtils.Date2StringDate(createdTime);
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "NewOrders{" +
                "driverUser=" + driverUser +
                ", infoUser=" + infoUser +
                ", newInfo=" + newInfo +
                ", oid=" + oid +
                ", ostatus=" + ostatus +
                ", createdTime=" + createdTime +
                ", car=" + car +
                '}';
    }
}

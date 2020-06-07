package com.bos.pojo;

import java.util.Date;

public class Orders {
    private Long oid;

    private Long driverUser;

    private Long infoUser;

    private Integer ostatus;

    private Date createdTime;

    private Long infoId;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Long getDriverUser() {
        return driverUser;
    }

    public void setDriverUser(Long driverUser) {
        this.driverUser = driverUser;
    }

    public Long getInfoUser() {
        return infoUser;
    }

    public void setInfoUser(Long infoUser) {
        this.infoUser = infoUser;
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }
}
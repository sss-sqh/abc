package com.bos.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {
    private Long iid;

    private String source;

    private String destination;

    private String iname;

    private Long iweight;

    private Long ivolume;

    private Long iuserId;

    private Date createdTime;

    private Date updatedTime;

    private Long typeGood1;

    private Long idriver;

    private Long icar;

    private Long icount;

    private String iremarks;

    private String ireceiver;

    private String ireceiverPhone;

    private String icost;

    private Long sprovince;

    private Long scity;

    private Long scounty;

    private Long dprovince;

    private Long dcity;

    private Long dcounty;

    private String iuserPhone;

    private String iuser;

    private Long typeGood2;

    private Integer istatus;

    public Long getIid() {
        return iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    public Long getIweight() {
        return iweight;
    }

    public void setIweight(Long iweight) {
        this.iweight = iweight;
    }

    public Long getIvolume() {
        return ivolume;
    }

    public void setIvolume(Long ivolume) {
        this.ivolume = ivolume;
    }

    public Long getIuserId() {
        return iuserId;
    }

    public void setIuserId(Long iuserId) {
        this.iuserId = iuserId;
    }

    public String getCreatedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(this.createdTime);
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(updatedTime);
        return date;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getTypeGood1() {
        return typeGood1;
    }

    public void setTypeGood1(Long typeGood1) {
        this.typeGood1 = typeGood1;
    }

    public Long getIdriver() {
        return idriver;
    }

    public void setIdriver(Long idriver) {
        this.idriver = idriver;
    }

    public Long getIcar() {
        return icar;
    }

    public void setIcar(Long icar) {
        this.icar = icar;
    }

    public Long getIcount() {
        return icount;
    }

    public void setIcount(Long icount) {
        this.icount = icount;
    }

    public String getIremarks() {
        return iremarks;
    }

    public void setIremarks(String iremarks) {
        this.iremarks = iremarks == null ? null : iremarks.trim();
    }

    public String getIreceiver() {
        return ireceiver;
    }

    public void setIreceiver(String ireceiver) {
        this.ireceiver = ireceiver == null ? null : ireceiver.trim();
    }

    public String getIreceiverPhone() {
        return ireceiverPhone;
    }

    public void setIreceiverPhone(String ireceiverPhone) {
        this.ireceiverPhone = ireceiverPhone == null ? null : ireceiverPhone.trim();
    }

    public String getIcost() {
        return icost;
    }

    public void setIcost(String icost) {
        this.icost = icost == null ? null : icost.trim();
    }

    public Long getSprovince() {
        return sprovince;
    }

    public void setSprovince(Long sprovince) {
        this.sprovince = sprovince;
    }

    public Long getScity() {
        return scity;
    }

    public void setScity(Long scity) {
        this.scity = scity;
    }

    public Long getScounty() {
        return scounty;
    }

    public void setScounty(Long scounty) {
        this.scounty = scounty;
    }

    public Long getDprovince() {
        return dprovince;
    }

    public void setDprovince(Long dprovince) {
        this.dprovince = dprovince;
    }

    public Long getDcity() {
        return dcity;
    }

    public void setDcity(Long dcity) {
        this.dcity = dcity;
    }

    public Long getDcounty() {
        return dcounty;
    }

    public void setDcounty(Long dcounty) {
        this.dcounty = dcounty;
    }

    public String getIuserPhone() {
        return iuserPhone;
    }

    public void setIuserPhone(String iuserPhone) {
        this.iuserPhone = iuserPhone == null ? null : iuserPhone.trim();
    }

    public String getIuser() {
        return iuser;
    }

    public void setIuser(String iuser) {
        this.iuser = iuser == null ? null : iuser.trim();
    }

    public Long getTypeGood2() {
        return typeGood2;
    }

    public void setTypeGood2(Long typeGood2) {
        this.typeGood2 = typeGood2;
    }

    public Integer getIstatus() {
        return istatus;
    }

    public void setIstatus(Integer istatus) {
        this.istatus = istatus;
    }

    @Override
    public String toString() {
        return "Info{" +
                "iid=" + iid +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", iname='" + iname + '\'' +
                ", iweight=" + iweight +
                ", ivolume=" + ivolume +
                ", iuserId=" + iuserId +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", typeGood1=" + typeGood1 +
                ", idriver=" + idriver +
                ", icar=" + icar +
                ", icount=" + icount +
                ", iremarks='" + iremarks + '\'' +
                ", ireceiver='" + ireceiver + '\'' +
                ", ireceiverPhone='" + ireceiverPhone + '\'' +
                ", icost='" + icost + '\'' +
                ", sprovince=" + sprovince +
                ", scity=" + scity +
                ", scounty=" + scounty +
                ", dprovince=" + dprovince +
                ", dcity=" + dcity +
                ", dcounty=" + dcounty +
                ", iuserPhone='" + iuserPhone + '\'' +
                ", iuser='" + iuser + '\'' +
                ", typeGood2=" + typeGood2 +
                ", istatus=" + istatus +
                '}';
    }
}
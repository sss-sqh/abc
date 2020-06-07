package com.bos.pojo;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private Date createdTime;

    private Date updatedTime;

    private String realname;

    private String status;

    private String sex;

    private String role;

    private String pic;

    private String driverType;

    private String validPeriod;

    private String fileNo;

    private Long cid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getDriverType() {
        if(driverType == null && driverType == ""){
            return "您还没有添加此信息！！";
        }
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType == null ? null : driverType.trim();
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo == null ? null : fileNo.trim();
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", realname='" + realname + '\'' +
                ", status='" + status + '\'' +
                ", sex='" + sex + '\'' +
                ", role='" + role + '\'' +
                ", pic='" + pic + '\'' +
                ", driverType='" + driverType + '\'' +
                ", validPeriod='" + validPeriod + '\'' +
                ", fileNo='" + fileNo + '\'' +
                ", cid=" + cid +
                '}';
    }
}
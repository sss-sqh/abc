package com.bos.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
    private Long cid;

    private String cno;

    private String ctype;

    private String cowner;

    private String caddress;

    private String cuseCharacter;

    private String cmodel;

    private String cvin;

    private String cengineNo;

    private Date cregisterDate;

    private Date cissusDate;

    private String cnum;

    private Integer cweight;

    private String cpic;

    private Long cuser;

    private Integer cstatus;

    private Integer cenable;

    private Date createdTime;

    private Date updatedTime;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype == null ? null : ctype.trim();
    }

    public String getCowner() {
        return cowner;
    }

    public void setCowner(String cowner) {
        this.cowner = cowner == null ? null : cowner.trim();
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress == null ? null : caddress.trim();
    }

    public String getCuseCharacter() {
        return cuseCharacter;
    }

    public void setCuseCharacter(String cuseCharacter) {
        this.cuseCharacter = cuseCharacter == null ? null : cuseCharacter.trim();
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel == null ? null : cmodel.trim();
    }

    public String getCvin() {
        return cvin;
    }

    public void setCvin(String cvin) {
        this.cvin = cvin == null ? null : cvin.trim();
    }

    public String getCengineNo() {
        return cengineNo;
    }

    public void setCengineNo(String cengineNo) {
        this.cengineNo = cengineNo == null ? null : cengineNo.trim();
    }

    public Date getCregisterDate() {
        return cregisterDate;
    }

    public void setCregisterDate(Date cregisterDate) {
        this.cregisterDate = cregisterDate;
    }

    public Date getCissusDate() {
        return cissusDate;
    }

    public void setCissusDate(Date cissusDate) {
        this.cissusDate = cissusDate;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum == null ? null : cnum.trim();
    }

    public Integer getCweight() {
        return cweight;
    }

    public void setCweight(Integer cweight) {
        this.cweight = cweight;
    }

    public String getCpic() {
        return cpic;
    }

    public void setCpic(String cpic) {
        this.cpic = cpic == null ? null : cpic.trim();
    }

    public Long getCuser() {
        return cuser;
    }

    public void setCuser(Long cuser) {
        this.cuser = cuser;
    }

    public Integer getCstatus() {
        return cstatus;
    }

    public void setCstatus(Integer cstatus) {
        this.cstatus = cstatus;
    }

    public Integer getCenable() {
        return cenable;
    }

    public void setCenable(Integer cenable) {
        this.cenable = cenable;
    }

    public String getCreatedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(createdTime);
        return date;
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
}
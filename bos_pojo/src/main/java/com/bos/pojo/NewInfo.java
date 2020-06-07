package com.bos.pojo;

public class NewInfo {
    private Info info;
    //表示发货地和目的地的组合地址
    private String address;
    //表示类型的组合
    private String type;

    public NewInfo (){

    }

    public NewInfo(Info info, String address) {
        this.info = info;
        this.address = address;
    }

    public NewInfo(Info info, String address, String type) {
        this.info = info;
        this.address = address;
        this.type = type;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NewInfo{" +
                "info=" + info +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

package com.bos.utils;

import java.util.Map;

public class Result {
    private boolean res;
    private String message;
    private Map<String,Object> map;

    public Result(){}

    public Result(boolean res, String message) {
        this.res = res;
        this.message = message;
    }

    public Result(boolean res, String message, Map<String, Object> map) {
        this.res = res;
        this.message = message;
        this.map = map;
    }

    public boolean isRes() {
        return res;
    }

    public void setRes(boolean res) {
        this.res = res;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Result{" +
                "res=" + res +
                ", message='" + message + '\'' +
                ", map=" + map +
                '}';
    }
}

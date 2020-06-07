package com.bos.pojo;

public class NewCar {
    private Car car;
    private User carUser;

    public NewCar(){

    }

    public NewCar(Car car, User carUser) {
        this.car = car;
        this.carUser = carUser;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getCarUser() {
        return carUser;
    }

    public void setCarUser(User carUser) {
        this.carUser = carUser;
    }

    @Override
    public String toString() {
        return "NewCar{" +
                "car=" + car +
                ", carUser=" + carUser +
                '}';
    }
}

package com.study.java_study.ch09_클래스04;

public class CarEntity {
    private int carNumber;
    private String carBrand;
    private String carName;
    private int carPrice;

    public CarEntity(int carNumber, String carBrand, String carName, int carPrice) {
        this.carNumber = carNumber;
        this.carBrand = carBrand;
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carNumber=" + carNumber +
                ", carBrand='" + carBrand + '\'' +
                ", carName='" + carName + '\'' +
                ", carPrice='" + carPrice + '\'' +
                '}';
    }
}

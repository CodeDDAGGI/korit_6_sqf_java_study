package com.study.java_study.ch09_클래스04;

public class CarMain {
    public static void main(String[] args) {
        CarService carService = new CarService();
        System.out.println("구매");

        while(carService.run()){};
        System.out.println("종료");
    }
}

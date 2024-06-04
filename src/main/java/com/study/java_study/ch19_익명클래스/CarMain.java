package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8" ,"화이트");
        System.out.println(kiaCar);

        /*
            익명 클래스 만들려면 추상 클래스나 인터페이스여야 한다
            쓰는 이유 : 일회용
            생성자의 이름 = 클래스 이름
            익명 클래스는 생성자를 생성할 수 없음
         */

        AbstractCar abstractCar = new AbstractCar("내가 만든 자동차", "블랙") { // extends 생략되어있음
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        };
    }
}

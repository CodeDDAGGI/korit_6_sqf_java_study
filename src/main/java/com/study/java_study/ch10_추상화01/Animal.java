package com.study.java_study.ch10_추상화01;

public class Animal { // Dog + Tiger의 공통부분
    // 메모리 자료형의 확장 ( 기존의 자료형에 추가를 하여 새로운 자료형을 만듬 )
    private String name;
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) { // 생성자 만들시 dog,Tiger에도 생성자 생성가능
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

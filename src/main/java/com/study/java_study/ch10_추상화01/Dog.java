package com.study.java_study.ch10.추상화01;

public class Dog extends Animal { // 상속
    private String breed;
    
    public Dog() {
        super(); // 기본적으로 생략되어있음 () 부모 객체 생성 - Animal 객체 생성자 호출 무조건 위에있어야함
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override // ctrl + o
    public void move() {
        System.out.println("강아지가 네 발로 움직입니다.");
    }

    public void bark () {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}

package com.study.java_study.ch10.추상화01;

public class Tiger extends Animal { // 내부적으로 Animal을 갖고있음
    private int power;

    public  Tiger() { // 생성자
        super(); // 기본적으로 생략되어있음 () 부모 객체 생성 - Animal 객체 생성자 호출
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
    
    // 재정의 -> 상속관계에서만 가능
    @Override // 재정의를 표시 @ 어노테이션
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다");
    }
    
    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}

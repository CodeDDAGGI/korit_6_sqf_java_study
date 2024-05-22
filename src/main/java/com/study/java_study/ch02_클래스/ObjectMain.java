package com.study.java_study.ch02_클래스;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10;     //10: 주소들어있음
        ObjectA objectA1 = new ObjectA(); // 변수는 소문자 시작 ObjectA안에 objectA를 담을수 있다
                            // 주소 100번
        ObjectA objectA2 = new ObjectA();
                            // 주소 200번

        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name);
        objectA1.name = "홍";
        objectA2.name = "길동";
        System.out.println(objectA1.name+objectA2.name);

    }
}

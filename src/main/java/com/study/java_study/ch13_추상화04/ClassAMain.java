package com.study.java_study.ch13_추상화04;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a1 = new ClassA1(); // 업캐스팅
        ClassA a2 = new ClassA2(); // 업캐스팅

        InterfaceA i1 = new InterfaceA1(); // 업캐스팅
        InterfaceA i2 = new InterfaceA2(); // 업캐스팅

        a1.print(i1); // a1안에 print
        System.out.println();
        a1.print(i2);
        System.out.println();
        a2.print(i1);
        System.out.println();
        a2.print(i2);

        // 클래스의 상속 관계는 1:1 기능을 구현할때
        // 인터페이스는 상속관계에서는 1:N 기능만들때

    }
}

package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{

    @Override // InterfaceA interfaceA 객체에 따라 값이 달라짐 print는 외부에서 객체가 주입댐 (D.I)
    public void print(InterfaceA interfaceA) { // print 메소드가 interfaceA를 의존함
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test(); // 의존성 주입 - 의존해야 실행이 댐
    }

    public void print() {

    }

}

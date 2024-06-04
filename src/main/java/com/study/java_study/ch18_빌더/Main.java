package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 내부 클래스 ( 클래스 안에 있는 클래스 )
        // 스태틱이 아닌 경우
        A a = new A();
        A d = new A();

        A.B b = a.new B(); // A클래스 안에 B를 생성할 때


        d.test();
        a.test();
        b.print();

        // A a = new A();
        A.C c = new A.C(); // A 클래스 안에 스태틱 C를 생성할 때
                           // A를 생성 안하고 작성 가능함
        c.show();          // c는 스태틱이 아니라서 c를 생성하고 호출해야댐

        A.C.show2();       // 동일 스태틱 시 .으로 연결
    }
}

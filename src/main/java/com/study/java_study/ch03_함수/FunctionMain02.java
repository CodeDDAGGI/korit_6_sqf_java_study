package com.study.java_study.ch03_함수;

public class FunctionMain02 {

    // FunctionMain > main > Function02
    public static void main(String[] args) {
        Function02 fx = new Function02(); // 실행이 되면 인스턴스(주소가 댐)
        // 자료형  변수형   fx01

        fx.fx01(); // 호출 클래스 Function02
        fx.fx02(5,(int)10.5);
        fx.fx02(300,20);
        System.out.println(fx.빙수만들기("딸기", 10) + " 주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);
    }
}

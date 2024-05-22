package com.study.java_study.ch03_함수;

public class Function02 { // 틀, 도구

    // 사용 설명서, 기능
    // 매개변수 없다 , 리턴 없다
    void fx01() {
        System.out.println("fx01 함수 호출");
    }
    
    // 매개변수 o, 리턴x
    void fx02(int num1 , int num2) { // 선언
        System.out.println("fx02 함수 호출");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

    String 빙수만들기(String 재료, int count) { // 문자열이니까 리턴도 문자열로 돌려주겠다
        return 재료 + "빙수 : " + count + "개";
    }

}

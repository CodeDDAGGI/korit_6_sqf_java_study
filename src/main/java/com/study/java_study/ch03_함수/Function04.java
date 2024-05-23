package com.study.java_study.ch03_함수;

public class Function04 {
    // 오버로딩 예시

    void add(int a , int b) {
        System.out.println(a + b);
    }

//    int add(int a, int b){
//        return System.out.println(a + b);
//    } 위의 함수랑 같은 자료형이여서 어느 곳에 함수를 실행할지 찾지 못한다.


    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }


    int sub(int a, int b){
        return  a - b;
    }

    int sub(int a, int b , int c){
        return  a - b;
    }

//        void add(int a , int b) {
//            System.out.println(a + b);
//        } 정수 + 정수면 구분을 못함

    // 매개변수 자료형이 중요
    void add(int a, String b){
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

}

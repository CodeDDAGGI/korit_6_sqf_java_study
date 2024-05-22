package com.study.java_study.ch03_함수;

public class FunctionMain01 {

    public static void main(String[] args) {
        Function01 function01 = new Function01();

        int result = function01.add(10, 2); // 12의 값을 result로 전달
        int result02 = function01.add(100 , 50); // 150의 값을 result02로 전달
        int result03 = function01.sub(10,5); // 5
        int result04 = function01.sub(100, 50); // 50

        System.out.println(result);
        System.out.println(result02);

        System.out.println(result03);
        System.out.println(result04);
    }
}

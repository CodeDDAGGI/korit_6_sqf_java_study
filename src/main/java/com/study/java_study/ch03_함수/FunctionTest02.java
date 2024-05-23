package com.study.java_study.ch03_함수;

public class FunctionTest02 { // 정의,틀

    int getAddData(int a, int b){
        FunctionTest03 functionTest03 = new FunctionTest03();
        a = 30;
        b = 40;
        System.out.println("a값 :" + a + "b값 :" + b );
        return functionTest03.add(a, b);
    }
}

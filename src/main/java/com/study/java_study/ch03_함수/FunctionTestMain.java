package com.study.java_study.ch03_함수;

public class FunctionTestMain {
    public static void main(String[] args) {
        FunctionTest01 functionTest01 = new FunctionTest01(); // new : 클래스를 복사
        // 스택 영역                      힙 영역

        functionTest01.printResult(); // 함수 호출
    }
}

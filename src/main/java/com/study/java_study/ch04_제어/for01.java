package com.study.java_study.ch04_제어;

public class for01 {

    public static void main(String[] args) {
        // 순서에 대한 반복문

        for(int i = 0; i < 10000; i++){
            System.out.println(i + 1);
        }

        for(int i = 0; i < 10000; i++){
            System.out.println(10000-i);
        }
    }

}

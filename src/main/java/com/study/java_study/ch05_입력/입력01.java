package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // in 입력 out 출력
        System.out.print("a : ");
        /*
            next() 메소드 특징
            1. 공복과 줄바꿈(엔터)은 무시한다
            2. 버퍼를 사용한다.
            
            버퍼(buffer)의 역할
            데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역
            키보드 포함 모든 입력 -> 버퍼에 저장
        */
        String a = scanner.next();
        // String a = scanner.next();  () 건네줄 값은 없는데 String을 return함
        System.out.println("에이 : " + a);

        System.out.print("b : ");
        String b = scanner.nextLine();
        System.out.println("비 : " + b);

    }
}

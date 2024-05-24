package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null;     // next()
        int age = 0;            // nextInt()
        String address = null;  // nextLine()
        String gender = null;   // next()
        String phone = null;    // nextLine()

        /*
        이름: 김병규
        나이: 28
        주소: 부산 해운대구 재반로
        성별: 남
        연락처: 010-9927-8536
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        name = scanner.next();
        System.out.print("나이 : ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소 : ");
        address = scanner.nextLine();
        System.out.print("성별 : ");
        gender = scanner.next();
        scanner.nextLine();
        System.out.print("연락처 : ");
        phone = scanner.nextLine();

        System.out.println();

        // 바로 아랫줄끼리 묶임
        // ctrl 2번 밑으로
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("연락처 : " + phone);
    }
}

package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;
// lang안에있는 건 import 없이 사용 가능
public class while01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int num = random.nextInt(5);  // 0 ~ 4 까지 중 랜덤

        while(true) {
            System.out.print("입력 : ");
            int data = scanner.nextInt();
            if (num == data) {
                System.out.println("정답은 " + data + "입니다");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요");
        }

    }
}

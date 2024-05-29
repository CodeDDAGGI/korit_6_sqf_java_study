package com.study.java_study.개인연습;

import java.util.Scanner;

public class StartService {

    private Scanner scanner;

    public SelectButton() {
    scanner = new Scanner(System.in);
    }

    public boolean Run() {
        boolean isRun = true;
        boolean start = false;

        while (isRun){
            System.out.println(" [  ] ");
            System.out.println("1. 시작 ");
            System.out.println("2. 캐릭터 생성 ");
            System.out.println("3. 설정");
            System.out.println("4. 나가기");
            select = scanner.nextLine();

            switch (select) {

            }

        }


        return isRun;

    }


}

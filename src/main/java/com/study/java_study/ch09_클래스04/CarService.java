package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class CarService {
    private Scanner scanner;
    private CarInfo carInfo;

    public CarService () {
        scanner = new Scanner(System.in);
        carInfo = new CarInfo();
    }

    private String selectMenu() {
        String menu = "1234q";
        String selectMenu = null;
        while(true) {
            System.out.println("메뉴선택");
            selectMenu = scanner.nextLine();
            if (menu.contains(selectMenu)){
                break;
            }
            System.out.println("다시 입력해주세요");
        }
        return selectMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("도서 관리 프로그램");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu){
            case "1" :

                break;
            case "2" :

                break;
            case "3" :

                break;
            case "4" :

                break;
            case "q":
                isRun = false;
                break;
            default:
                System.out.println("잘못된 입력입니다");

        }
        return isRun;
    }

//    private String registerCarName () {
//        String carName = null;
//        while(true) {
//            carName =
//        }
//    }
//
//    private registerCar() {
//        System.out.println(" 자동차 등록 ");
//
//        int carId = carInfo.incrementCarNumber();
//        String carName =
//    }
//
}

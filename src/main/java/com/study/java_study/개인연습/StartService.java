package com.study.java_study.개인연습;

import java.util.Random;
import java.util.Scanner;

public class StartService {

    private Scanner scanner;
    private StartRepository startRepository;

    public StartService() {
        scanner = new Scanner(System.in);
    }

    public boolean Run() {
        boolean isRun = true;
        boolean start = false;

          // 초기 화면
            System.out.println(" [ 시작 ] ");
            System.out.println("1. 시작 ");
            System.out.println("2. 캐릭터 생성 ");
            System.out.println("3. 설정");
            System.out.println("4. 나가기");
            String select = scanner.nextLine();

            switch (select) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
            System.out.println();

            return isRun;
    }

    public void createChar() {

        Random random = new Random();

        System.out.println("캐릭터의 이름 : ");
        String yourName = scanner.nextLine();

        System.out.println("캐릭터의 성별 : ");
        String gender = scanner.nextLine();

        System.out.println("아이디 : ");
        int charId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("체력, 힘 , 방어력 설정 중");
        int health = random.nextInt(15);
        int power = random.nextInt(15);
        int armor = random.nextInt(15);
        System.out.println(" 체력 : " + health);
        System.out.println(" 힘   : " + power);
        System.out.println(" 방어 : " + armor);
        StateEntity newChar = new StateEntity(charId,yourName, gender,health,power,armor);
        startRepository.save(newChar);
    }

//    private  void registerChar () {
//
//        System.out.println(" [ 캐릭터 생성 ] ");
//        System.out.println();
//        StateEntity[] character = new StateEntity( charId,
//        yourName,gender ,  health , power, armor);
//
////        startRepository.saveChar(character);
//    }


    }

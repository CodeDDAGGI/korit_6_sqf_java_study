//package com.study.java_study.ch04_제어;
//
//import java.util.Scanner;
//
//public class while04 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        boolean isMain = true;
//        while(isMain){
//            System.out.println("[메뉴선택]");
//            System.out.println(" 1. 조회 ");
//            System.out.println(" 2. 등록 ");
//            System.out.println(" 3. 탈퇴 ");
//            System.out.println(" 4. 프로그램 종료");
//            String  mainBtn = scanner.nextLine();
//                switch (mainBtn){
//                    case "1":
//                        System.out.println("조회를 선택하셨습니다");
//                        boolean subMenu1 = true;
//                        while (subMenu1){
//                            System.out.println("[조회 메뉴]");
//                            System.out.println(" 1. 회원 번호로 조회");
//                            System.out.println(" 2. 이름으로 조회");
//                            System.out.println(" 3. 휴대폰 번호로 조회");
//                            System.out.println(" 4. 메뉴 나가기");
//                            System.out.println(" 5. 프로그램 종료");
//                            String subMenuBtn = scanner.nextLine();
//                            switch (subMenuBtn){
//                                 case "1" :
//                                      System.out.println("회원 번호 입력 조회로 들어오셨습니다.");
//                                      break;
//                                 case "2" :
//                                      System.out.println("이름 입력 조회 메뉴로 들어오셨 습니다.");
//                                      break;
//                                 case "3" :
//                                      System.out.println("휴대폰 번호 입력 조회 메뉴로 들어오셨습니다");
//                                      break;
//                                 case "4" :
//                                      System.out.println("뒤로가기 버튼을 누르셨습니다.");
//                                      subMenu1 = false;
//                                      break;
//                                 case "5" :
//                                     System.out.println("프로그램을 종료합니다");
//                                     isMain = false;
//                                     subMenu1 = false;
//                                     break;
//                                default:
//                                    System.out.println("다시 눌러주세요.");
//                                }
//                        }
//                    case "2" :
//                        System.out.println("등록 메뉴로 들어오셨습니다");
//                        boolean subMenu2 = true;
//                        while (subMenu2){
//                            System.out.println("1. 휴대번호 가입 ");
//                            System.out.println("2. 회원가입 ");
//                            System.out.println("3. 비회원 ");
//                            System.out.println("4. 뒤로가기");
//                            System.out.println("5. 프로그램 종료");
//                            String subMenuBtn = scanner.nextLine();
//                            switch (subMenuBtn){
//                                case "1" :
//                                    System.out.println("1. 휴대번호로 가입 메뉴로 들어오셨습니다.");
//                                    break;
//                                case "2" :
//                                    System.out.println("2. 회원가입 메뉴로 들어오셨습니다.");
//                                    break;
//                                case "3" :
//                                    System.out.println("3. 비회원 메뉴로 들어오셨습니다.");
//                                    break;
//                                case "4" :
//                                    System.out.println("4. 뒤로가기");
//                                    boolean subMenu2 = false;
//                                    break;
//                                case "5" :
//                                    System.out.println("5. 프로그램 종료");
//                                    boolean subMenu2 = false;
//                                    boolean subMenu2 = false;
//                                default:
//                                    System.out.println("다시 입력해 주세요.");
//
//                            }
//                        }
//
//                }
//        }
//
//    }
//}

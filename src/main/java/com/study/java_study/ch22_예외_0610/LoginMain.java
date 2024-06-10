package com.study.java_study.ch22_예외_0610;


import java.util.Scanner;

public class LoginMain {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void login(String username, String password) throws LoginException { // equals를 쓸때 username이 null이 들어올 가능성을 배제하는게 좋음
        if(!(USERNAME.equals(username) && PASSWORD.equals(password))){
            throw new LoginException("로그인 실패" , username);
        }
        System.out.println("로그인 성공 이후 절차 진행");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.println("사용자이름 : ");
        username = scanner.nextLine();
        System.out.println("비밀번호 : ");
        password = scanner.nextLine();

        try{
        login(username,password);
        }catch (LoginException e){
            System.out.println(e.getMessage());
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}

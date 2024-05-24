package com.study.java_study.ch04_제어;

public class StudyStar {
    public static void main(String[] args) {
        
        // 반복횟수만 생각
        // i < 5(줄의 수)
        // 5를 조건식으로 그대로 가져오면 변수가 될 수 있음
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5 - 1 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 지역 변수
        // int j는 각 for문에서만 사용되고 있어서 
        // 같은 변수명을 사용할 수 있음
    }
}

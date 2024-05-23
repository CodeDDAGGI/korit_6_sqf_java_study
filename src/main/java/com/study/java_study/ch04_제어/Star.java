package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {

        /*

         *
         **
         ***
         ****
         *****

         */


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            int num = 0;
            for (int j = 0; j < 4 - i; j++) { // i = 0 4번 반복 i = 1 3번
                System.out.print(" ");
            }
<<<<<<< HEAD
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 - i; i++ ){ // i = 0 4번 반복 i = 1 3번
                System.out.print("*");
            }

            System.out.println();
        }

        /*
        *****
         ****
          ***
           **
            *

          *
         ***
        *****
       *******
      *********
=======
            for (int k = 0; k < i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println();

        for (int i = 0; i < 5; i++){

            for (int j = 0; j < i; j++ ){ // i = 0 4번 반복 i = 1 3번
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++){

            for (int j = 0; j < 4 - i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 1 + 2 * i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

            /*                  뛰칸   증가값
                          *      4      1
                         ***     3      3   1(홀수) + ? (짝수) = 홀수
                        *****    2      5   1(홀수) + ? (짝수) = 홀수
                       *******   1      7   1(홀수) + ? (짝수) = 홀수
                      *********  0      9   1(홀수) + ? (짝수) = 홀수
>>>>>>> c6c613113f1a13486d8eb397fc9f9dececa9c5a4


             */


    }
}

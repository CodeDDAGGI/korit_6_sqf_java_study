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

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            int num = 0;
            for (int j = 0; j < 4 - i; j++) { // i = 0 4번 반복 i = 1 3번
                System.out.print(" ");
                }
            while(num < i + 1){
                    System.out.print("*");
                    num++;
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++){
            int num = 0;
            for (int j = 0; j < 5 - i; i++ ){ // i = 0 4번 반복 i = 1 3번
                System.out.print("*");
            }
            while(num < i + 1){
                System.out.print(" ");

            }
            System.out.println();
        }

        /*
          *
         ***
        *****
       *******
      *********


        */

    }
}

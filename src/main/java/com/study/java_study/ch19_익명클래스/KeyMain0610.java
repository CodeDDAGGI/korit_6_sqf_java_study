package com.study.java_study.ch19_익명클래스;

public class KeyMain0610 {
    public static void main(String[] args) {

        Key0610 attackKey = new AttackKey0610();
        attackKey.onKeyUp();
        attackKey.onKeyDown();

        // 생성과 동시에 정의
        Key0610 customKey = new Key0610() {// 익명클래스 { }
            @Override
            public void onKeyUp() {
                System.out.println("커스텀 키 땜");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀키 누름");
            }
        };

        customKey.onKeyDown();
        customKey.onKeyUp();
    }
}

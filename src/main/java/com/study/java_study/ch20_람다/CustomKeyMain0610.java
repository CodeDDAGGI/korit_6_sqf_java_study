package com.study.java_study.ch20_람다;

public class CustomKeyMain0610 {
    public static void main(String[] args) {
        CustomKey0610 attackKey = new CustomKey0610() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };

        attackKey.onKeyPress();

        CustomKey0610 skillKey = () -> {
            System.out.println("스킬키 누름");
        };

        skillKey.onKeyPress();
    }
}

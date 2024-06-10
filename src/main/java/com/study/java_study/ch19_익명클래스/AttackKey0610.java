package com.study.java_study.ch19_익명클래스;

public class AttackKey0610 implements Key0610{
    @Override // 컨트롤 + I
    public void onKeyUp() {
        System.out.println("공격키 땜");
    }

    @Override
    public void onKeyDown() {
        System.out.println("공격키 누름");
    }
}

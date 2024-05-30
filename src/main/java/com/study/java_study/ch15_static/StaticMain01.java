package com.study.java_study.ch15_static;

/*
    스태틱(static)
    1. 공유 영역
    2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한다.
 */

public class StaticMain01 {
    public static void main(String[] args) {

        System.out.println(Static01.num);
        Static01.num = 20;
        System.out.println(Static01.num);
                // 변수
        Static01 static01 = new Static01();
        static01.num = 30;
        System.out.println(Static01.num);
                           //클래스
    }
}

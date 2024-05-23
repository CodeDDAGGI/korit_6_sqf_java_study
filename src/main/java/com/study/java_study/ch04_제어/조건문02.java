package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) { //함수자료형이 void이면 return이 없어도 됨
        String text = new String("");
        String name = "홍길동";       // 값의 자료형 String
        String phone = "01099278536";    // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        System.out.println(text);
        System.out.println(name);
        System.out.println(phone);

//        System.out.println(text.length());
//        System.out.println(name.length());
//        System.out.println(phone.length()); // NullPointerException

        // == : 주소값 비교
        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return; // 프로그램 종료라 의미가 없다
        }

    }
}

package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?

        //int num;
        //num = 10;

        Message<?> m1; // Object = ?  : 와일드카드
        Message<String> m2 = null;

        m1 = new Message<>(10);
        String s = (String) m1.getMessage(); // 다운캐스팅

        // 와일드 카드 제약 - 와일드카드로 쓸수있는 범위
        Message<? extends String> m3 = new Message<>("10"); // 자기자신이나 String을 상속받는 것만 들어올수있음 (자신포함 하행)
        Message<? super  String> m4 = new Message<>(new Object()); // 자기자신 타입으로 부터 상행

        String s2 = m3.getMessage();

    }
}

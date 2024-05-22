package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "홍길동", 30, "00000000000");

        // 객체의 묶음으로 데이터를 넘겨줘야 댐
        Student st = new Student(); // Student 자료형 생성
        // Student 정보 입력 - st객체에 데이터가 기입됨
        st.name = "홍길동"; 
        st.age = 25;
        st.phone="01054878966";
        st.studentCode=1235;

        fx.fx02(st);
    }

}

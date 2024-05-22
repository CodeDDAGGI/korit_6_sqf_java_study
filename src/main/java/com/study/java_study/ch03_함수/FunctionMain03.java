package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "홍길동", 30, "00000000000");

        // 객체의 묶음으로 데이터를 넘겨줘야 댐 std:변수
        Student std = new Student(); // new Student() 실제 데이터가 들어가는 곳
        std.name = "홍길동";
        std.age = 30;
        std.studentCode = 1234;
        std.phone= "01099456452";
        
        fx.fx02(std);
    }

}

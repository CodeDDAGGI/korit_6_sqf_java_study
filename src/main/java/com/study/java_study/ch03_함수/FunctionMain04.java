package com.study.java_study.ch03_함수;

public class FunctionMain04 {
    public static void main(String[] args) {

        Function04 st = new Function04();

        Student01 std = new Student01();
        std.age = 20;
        std.code = 1234;
        std.name = "김병규";
        std.major = "취준생";
        st.lf(std);
    }

}   

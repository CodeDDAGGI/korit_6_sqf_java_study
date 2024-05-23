package com.study.java_study.ch04_제어;

public class StringUtils {
    // 단일책임원칙 : 하나의 함수는 하나의 역할을 한다
    boolean isEmpty(String str) {
        if(str == null){
            return true;
        }
        return str.equals("");
    }
}

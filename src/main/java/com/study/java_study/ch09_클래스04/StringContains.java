package com.study.java_study.ch09_클래스04;

public class StringContains {

    public static void main(String[] args) {
        String str = "법의 해석, 학리적 해석, 논리적해석, 확장 해석";

        boolean isContains = "법의 해석, 학리적 해석, 논리적해석, 확장 해석".contains("해석"); // 변수나 문자에 바로 적용해도됨
        
        System.out.println(isContains);
        
        String isCon = "법의 해석 , 학리적 해석";
        System.out.println(isCon.contains("해석"));
        
    }
}

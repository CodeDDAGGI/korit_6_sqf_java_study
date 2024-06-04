package com.study.java_study.ch18_빌더;

public class A {
    // A안에 B를 사용하려면 A를 생성해야함
    public void test() {
        System.out.println("A 클래스 테스트");
    }

    public class B {

        public void print(){
            System.out.println("B 클래스 클릭");
        }
    }
    
    public static class C{
        
        public void show() {
            System.out.println("C 클래스 조회");
        }

        public static void show2() {
            System.out.println("C 클래스 조회2");
        }
    }
}

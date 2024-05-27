package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB;
// 패지키가 다르면 import사용

/*
    1. private -> 같은 객체 안에서만 접근 할 수 있다.(같은 클래스 내에서 사용 가능)
    2. public -> 모든 영역에서 접근 할 수 있다.
    3. default -> 같은 페키지 안에서만 접근 할 수 있다. (앞에 아무것도 안붙힌게 default)
    4. protectied -> default와 동일하게 같은 패키지 안에서 접근 할 수 있고,
                     상속관계일 때에는 다른 패키지에 있어도 접근 할 수 있다.
*/
public class AccessMain {
    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("김준일", 28);
        b.show();
        b.setName("김준이");
        System.out.println(b.getName());

        AccessMain accessMain = new AccessMain();
        accessMain.printTest();
        accessMain.test = "테스트";
    }
}

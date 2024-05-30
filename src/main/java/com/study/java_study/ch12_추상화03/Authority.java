package com.study.java_study.ch12_추상화03;

/*
    인터페이스 - 추상화를 위해 만들어짐 (라이브러리때 사용)
    1. 일반 클래스와 동일하게 정의할 수 없다.
    2. 일반 변수(멤버변수)는 정의 할 수 없다.
    3. 무조건 상수만 정의 할 수 있다.
    4. 일반 메소드(멤버 메소드)를 정의하기 위해서는 default 키워드를 사용하여야한다
    5. 추상 메서드를 정의 할 때 abstract 키워드를 생략 할 수 있다.
    6. 인터페이스 안에 정의되어 지는 모든 상수의 메소드들은 public 접근 지정자를 사용한다.

    - 인터페이스는 기본 default(인터페이스내 일반 메소드임)값이 public이라서
    default를 붙히면 일반 메소드 사용가능

    상속개념은 상위 개념
    ex)tv,모니터가 화면을 출력하는게 상위개념
    전원을 공급한다라고 할때 어떻게 공급할것인가? 추상화
    같은 인터페이스(기능)끼리는 확장 extends(상속)
    클래스와 클래스 extends
    인터페이스와 클래스 implements
 */

public interface Authority { // 권한
    String DEFAULT_ROLE = "ROLE_USER"; // 인터페이스 안에
    //   static final이 생략이 되있음(기본값)
    
    // public abstract 생략 - 일반 메소드는 {}가 있어야함
    String getAuthority();

    public  default void prinAuthority() {
        System.out.println(DEFAULT_ROLE);
    }

}

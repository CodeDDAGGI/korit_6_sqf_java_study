package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface0610 {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };

        // 람다식
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();

        // 제네릭 지정 후 new 하면 타입이 지정댐
        // 제네릭 없을땐 object
//      Function<String, Integer> fx = new Function<String, Integer>() {
//          @Override
//          public Integer apply(String s) {
//              return Integer.parseInt(s);
//          }
//      };
        // 매개변수의 자료형 생략 가능
        // 매개변수는 변수이기떄문에 아무거나 원하는걸로 정의 가능
        // 중괄호 생략시 리턴도 생략(한 줄일 경우)
        // 매개변수가 하나일 경우 매개변수을 감싸는 소괄호 생략 가능
        Function <String, Integer>fx = s -> Integer.parseInt(s);

        Integer num = fx.apply("10");
        System.out.println("num : " + num);

        // apply 실행 후 andThen 실행
        Integer num2 = fx.andThen(result -> result + 100).apply("10");
        System.out.println("num2 : " + num2);

        Consumer<String> transform = s -> {
                System.out.println(s + "서버에 접속하였음 ");
                System.out.println(s + "님 환영합니다.");
            };

        transform.accept("김준일");
        // 람다쓰는 이유
        // 메소드안에 메소드를 사용할 수없음(main메소드)
        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };

        System.out.println(role.get());

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));

    }
}

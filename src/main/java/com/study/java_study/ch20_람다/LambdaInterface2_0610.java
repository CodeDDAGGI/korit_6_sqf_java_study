package com.study.java_study.ch20_람다;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2_0610 {
    public static void main(String[] args) {

        Runnable run = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };


        Consumer<String> consumer = a -> {
            System.out.println(a);
        };

        consumer.accept("홍길동");


        Function <String ,Integer>xs = js -> Integer.parseInt(js);

        Integer num = xs.andThen(result -> result + 100).apply("20");
        Integer con = xs.apply("10");

        System.out.println(num);
        System.out.println(con);

        Supplier<String> name = () -> {
            Integer fu = con + num + 50;
            System.out.println(con + num);
            return fu.toString();
        };

        System.out.println(name);


    }
}

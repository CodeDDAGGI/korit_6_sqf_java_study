package com.study.java_study.ch18_빌더;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numbers2 = new ArrayList<>();

        // 방법 1
        for(Integer n: numbers) {
            numbers2.add(n * 2);
        }

        // 방법 2
        // 스트림 사용
        List<Integer> numbers3 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());

        // 스트림
        Stream<Integer> stream = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(6)
                .build();

        Stream<Integer> stream1 = Stream.<Integer>builder()
                        .add(1)
                        .add(2)
                        .add(3)
                        .build();


        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbers3);
        System.out.println(stream.collect(Collectors.toList()));
        System.out.println(stream1.collect(Collectors.toList()));


//        for(int i = 0; i < numbers.size(); i++){
//            numbers2.add(i * 2);
//            System.out.println(numbers2);
//        }



    }
}

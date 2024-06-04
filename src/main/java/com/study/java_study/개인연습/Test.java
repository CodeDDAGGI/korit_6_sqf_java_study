package com.study.java_study.개인연습;

import com.study.java_study.개인연습.TestMain;

import java.util.List;
import java.util.Map;

public class Test {

    private static Test instance;

    private Test() {};

    public static Test getInstance(){
        if(instance == null){
            instance = new Test();
        }
        return instance;
    }

    private List<Map<String, Object>> TestDB = List.of(
            Map.of(
                    "testId" , 1,
                    "testName", "테스트1"
            ),
            Map.of(
                    "testId" , 2,
                    "testName", "테스트2"
            ),
            Map.of(
                    "testId" , 3,
                    "testName", "테스트3"
            )
    );

    public void run2() {
        System.out.println("테스트 요청");
//        List<TestEntity>testEntities = run3();

    }
    public void run3() {

    }
    public void run4() {

    }



}
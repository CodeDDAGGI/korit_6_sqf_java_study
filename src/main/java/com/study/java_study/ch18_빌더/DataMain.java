package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 10 , 10.5 ,"b");
     // Data data = new Data("a", 0 , 10.5 ,null);
        Data data2 = new Data();
     // 각각의 원하는 자리에 값 기입
        data2.setData1("a");
        data2.setData3(3.14);
     // 하나의 동작이 아니라 개별적으로 값이 기입 되있음

     // DataEntity dataEntity = DataEntity.builder().data1("a").build();
                               // 100.data1()  주소
                                    // 100주소

        DataEntity dataEntity = DataEntity.builder()
                .data4("b")
                .data1("a")
                .data2(10)
                .data3(2.15)
                .build();

//        DataEntity dataEntity3 = DataEntity.builder()
//                .data3(2.01);
//                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")
                .build();
    }

}

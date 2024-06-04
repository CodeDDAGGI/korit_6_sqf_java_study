package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter // 원하는 자리에 값 기입
public class Data {

    private String data1;
    private int data2;
    private double data3;
    private String data4;

//    생성 X
//    public Data(String data1) {
//        this.data1 = data1;
//    }
//    public Data(int data2) {
//        this.data2 = data2;
//    }
//    public Data(double data3) {
//        this.data3 = data3;
//    }
//
//    public Data(String data4){
//        this.data4 = data4;
//    }


}

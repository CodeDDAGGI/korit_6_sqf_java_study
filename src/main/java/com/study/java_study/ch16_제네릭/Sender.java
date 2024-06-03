package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender< T, T2 , T3 > { // 타입을 여러개로 받을수 있음
    private T data1; // 자동 Integer 적용 Main 에서 Integer 자료형사용으로 자동박싱댐
    private T2 data2;
    private T3 data3;

    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public T3 getData3() {
        return data3;
    }

    public void setData3(T3 data3) {
        this.data3 = data3;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

}

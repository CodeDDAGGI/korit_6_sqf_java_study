package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class AbstractCar {
//  @Getter 각 분할에서 적용가능
    private String model;
//  @Getter
    private String color;

    public abstract void createCar();
    public abstract void showCar();


}

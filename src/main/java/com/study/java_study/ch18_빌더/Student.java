package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Setter
@ToString
public class Student {
    private int studentCode;
    private String name;
    private int age;

}

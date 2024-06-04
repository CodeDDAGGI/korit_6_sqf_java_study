package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {


        Student studentEntity = Student.builder()
                .studentCode(12)
                .name("김병규")
                .age(25)
                .build();

        System.out.println(studentEntity);

        StudentEntity studentEntity1 = StudentEntity.builder()
                .studentCode(1)
                .name("김병규")
                .age(25)
                .build();

        System.out.println(studentEntity1);
    }


}

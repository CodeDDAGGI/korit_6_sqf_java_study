package com.study.java_study.ch18_빌더;

public class StudentEntity {
    private int studentCode;
    private String name;
    private int age;

    public StudentEntity(int studentCode, String name , int age){
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public static StudentEntityBuilder builder() {
        return new StudentEntityBuilder();
    }

    public static class StudentEntityBuilder {
        private int studentCode;
        private String name;
        private int age;

        public StudentEntity build(){
            return new StudentEntity(studentCode,name,age);
        }

        public StudentEntityBuilder studentCode(int studentCode){
            this.studentCode = studentCode;
            return this;
        }

        public StudentEntityBuilder name(String name){
            this.name = name;
            return this;
        }

        public StudentEntityBuilder age(int age){
            this.age = age;
            return this;
        }

    }



}


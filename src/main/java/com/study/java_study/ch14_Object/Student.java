package com.study.java_study.ch14_Object;


import java.util.Objects; // object를 다루는 도구들이 있음 Objects

public class Student{ // 모든 클래스는 자동으로 최상위 개념인 Object가 있음
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 변수
    // 생성자
    // getter and setter
    // equals
    // hashCode
    // toString


    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }// 주소가 같으면 같은 값이다 라는 뜻
        if(obj.getClass() == this.getClass()){ // 오브젝트클래스와 자기자신의 클래스가 같을때
            Student student = (Student) obj; // 다운 캐스팅
            return Objects.equals(student.name, name) && Objects.equals(student.age , age); // equal은 매개변수 한개 equals는 2개
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

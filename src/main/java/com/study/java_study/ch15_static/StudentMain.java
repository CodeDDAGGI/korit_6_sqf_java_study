package com.study.java_study.ch15_static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.


    스태틱 규칙
    스태틱은 스태틱끼리만 사용가능
 */

public class StudentMain {
    public static void main(String[] args) {
        // StudentService studentService = new StudentService();
        // StudentService 클래스에 private로 정의되어있어서 오류남
        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("김준이");
        studentService2.addStudent();

        studentService.getStudentData();

//      StudentRepository studentRepository = StudentRepository.getInstance();

    }
}

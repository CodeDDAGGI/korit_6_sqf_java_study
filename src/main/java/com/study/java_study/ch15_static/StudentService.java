package com.study.java_study.ch15_static;

public class StudentService {
    private static StudentService instance; // instance에 null이 들어있음
                // StudentService 자기자신 객체

    private StudentService() {}

    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    public void addStudent() {
        StudentRepository.getInstance().add("김준일");
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}

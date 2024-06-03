package com.study.java_study.ch15_static;

public class StudentRepository {

    private static StudentRepository instance;
    private  String[] names;


    private StudentRepository() {
        names = new String[5];
    }

    // 스태틱 생성
    // 자기자신을 담을수 있는 인스턴스 변수 필요
    // 생성자를 private로 막아야댐 (외부에서 생성되는걸막아야함)
    // 자기자신만의 객체를 생성(스태틱)
    public static StudentRepository getInstance() { // 메소드의 리턴 자료형(getInstance 주소)
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name){
        for(int i = 0; i < names.length; i++){
            if(names[i] == null){
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}

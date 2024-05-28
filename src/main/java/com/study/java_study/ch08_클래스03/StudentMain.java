package com.study.java_study.ch08_클래스03;

public class StudentMain {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Student[] student = new Student[5]; // null

        numbers[0] = 10;

        Student student1 = new Student(20240501 , "김준일" , 31);
        Student student2 = new Student(20240502 , "김준이" , 32);
        Student student3 = new Student(20240503 , "김준삼" , 33);// 배열의 공간만 만들어준다는 것만 다르지 밑에와 같다

        Student[] studentss = new Student[] {
                new Student(20240501 , "김준일" , 31),
                new Student(20240501 , "김준일" , 31),
                new Student(20240501 , "김준일" , 31),
        };

        Student[] students = new Student[3];
        students[0] = new Student(20240501 , "김준일" , 31);
        students[1] = new Student(20240502 , "김준이" , 32);
        students[2] = new Student(20240503 , "김준삼" , 33);
        students[3]= new Student(2024055 , "김준삼" , 34);

        students[14] = new Student(2215 , "김준일"  , 45);

        String name = students[0].getName();
        System.out.println(students[0].getName());

        for(int i = 0; i < students.length; i ++) {
            if(students[i] == null){ // 오류방지
                continue;
            }
            System.out.println("학번 : " + students[i].getCode());
            System.out.println("이름 : " + students[i].getName());
            System.out.println("나이 : " + students[i].getAge());
            System.out.println();
        }


    }
}

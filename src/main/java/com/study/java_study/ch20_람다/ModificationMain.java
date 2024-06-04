package com.study.java_study.ch20_람다;

public class ModificationMain {

    public static void main(String[] args) {
        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존 데이터 : " + oldData);
                System.out.println("신규 데이터 : " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {

                return newData;
            }
        };
        
        Modification<String> m4 = (oldData , newName) -> newName; // 한 줄로 완성시 리턴 생략가능



        Modification<String> m3 = (String oldName, String newName) ->{
            System.out.println("기존의 데이터: " + oldName);
            System.out.println("신규의 데이터: " + newName);
            return newName;
        };

        String name = "김준일";
        String newName = m1.modify(name, "김준이");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김준삼");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "김준사");
        System.out.println(newName3);

        String newName4 = m4.modify(name , "김준오");
        System.out.println(newName4);
    }
}

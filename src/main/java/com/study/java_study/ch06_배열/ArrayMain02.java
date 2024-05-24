package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김준일" == 999
        String a = "김준일";               // 999
        String b = new String("김준일");   // 200주소 안에 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일"); 
        System.out.println(b == "김준일");
        System.out.println(a == b);
        
        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");//1-1
        
        String[] names2 = new String[] {"김준일", new String("김준일")};//2-1

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);// new String
        System.out.println(names == names2);

        int n = 10;
        n = n + 1;
        n++;
        n += 1;

        System.out.println(new String[2]); // 출력 [ : 주소의 시작
        System.out.println(new String[] {"a","b"}); // 배열을 새로생성해서 [a, b]를 생성
        //System.out.println({"a", "b"});  의미없는 코드

    }
}

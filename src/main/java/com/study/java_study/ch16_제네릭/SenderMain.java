package com.study.java_study.ch16_제네릭;


public class SenderMain {
    public static void main(String[] args) {
        //String이나 int로 받고 싶을경우 방법 2가지
        //Sender sender = new Sender("test1", "test2");
        //Sender sender2 = new Sender(10, 20);

        //Object 이용

        // [ Wrapper 자료형 ]
        // Integer                  int
        // Boolean  -- (언박싱)-->   boolean
        // Character                char
        // Double   <-- (박싱) --    double
        // Long                     long
        // Float                    float

        Integer num = new Integer(10); // 박싱
        int num2 = num.intValue();     // 언박싱

        // 자동 박싱 / 언박싱
        Integer num3 = 20;
        int num4 = num3;

        Sender sender1 = new Sender<Integer , String , Double>(10,"20", 3.14);
        Sender<Integer , String , Double> sender2 = new Sender<>(10, "20" , 3.14);

        System.out.println(sender1);
        System.out.println(sender2);


    }
}

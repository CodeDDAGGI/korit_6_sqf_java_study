package com.study.java_study.ch10_추상화01;

public class animalMain {
    public static void main(String[] args) {

        Dog dog = new Dog("콩이" , 11 , "마티즈");
        Animal tiger = new Tiger("옹이" ,5 ,100); // 업캐스팅

        dog.move();
        tiger.move(); // 업캐스팅을 한다해도 부모가 가진 자료형을 사용할순 없다 - 재정의 시
        ((Tiger)tiger).hunt(); // 다운 캐스팅 - ( ) 안에 기입해줘야지 우선순위에서 안밀림
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이" , 11 , "말티즈");
        animals[2] = new Tiger("옹이" , 5 , 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        for(Animal animal : animals) {
            // instanceof 자료형이 먼지 체크
            if(animal instanceof Tiger){
                Tiger t = (Tiger) animal;
                t.hunt();
            }else if (animal instanceof  Dog){
                Dog d = (Dog) animal;
                d.bark();
            }

        }

        System.out.println();

        for(Animal animal : animals) {
            String s = "test";
            int a = 10;
            System.out.println(s.getClass());

            // instanceof 자료형이 먼지 체크
            if(animal.getClass() == Tiger.class){
                Tiger t = (Tiger) animal;
                t.hunt();
            }else if (animal.getClass() == Dog.class){
                Dog d = (Dog) animal;
                d.bark();
            }

        }

    }
}

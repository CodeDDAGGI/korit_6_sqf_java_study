package com.study.java_study.개인연습;

import java.util.Random;
import java.util.Scanner;

public class StartRepository {

    private int charId;
    private StateEntity[] chars;

    public StartRepository() { chars = new StateEntity[0]; }

    public void saveChar ( StateEntity character){
        StateEntity[] newChar = new StateEntity[chars.length + 1];

        for(int i =0; i< chars.length; i++){
            newChar[i] = chars[i];
        }
        chars[chars.length -1] = character;
        chars = newChar;
    }

    public void charsState () {
        for (StateEntity character : chars){
            System.out.println("ID : " + character.getCharId() +
                    ", Name: " + character.getYourName() +
                    ", Gender: " + character.getGender() +
                    ", Health: " + character.getHealth() +
                    ", Power: " + character.getPower() +
                    ", Armor: " + character.getArmor());
        }
    }

    public StateEntity createChar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("캐릭터의 이름 : ");
        String yourName = scanner.nextLine();

        System.out.println("캐릭터의 성별 : ");
        String gender = scanner.nextLine();

        System.out.println("체력, 힘 , 방어력 설정 중");
        int health = random.nextInt(15);
        int power = random.nextInt(15);
        int armor = random.nextInt(15);

        return new StateEntity(charId,yourName,gender,health,power,armor);


        if(yourName != null){

        }




        return character;
    }
}

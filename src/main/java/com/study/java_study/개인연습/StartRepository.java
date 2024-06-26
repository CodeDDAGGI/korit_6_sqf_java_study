package com.study.java_study.개인연습;

import java.util.Random;
import java.util.Scanner;

public class StartRepository {

    // 삭제 수정 추가 조회 생성
    private int charId;
    private StateEntity[] chars;
    public StartRepository() { chars = new StateEntity[0]; }

    public void saveChar (){
        StateEntity[] newChar = new StateEntity[chars.length + 1];

        for(int i =0; i< chars.length; i++){
            newChar[i] = chars[i];
        }
        chars = newChar;
    }

    //save
    public void save(StateEntity newChar){
        saveChar();
        chars[chars.length - 1] = newChar;
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
}

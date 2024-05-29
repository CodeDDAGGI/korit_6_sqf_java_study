package com.study.java_study.개인연습;

public class StateEntity {
    private int charId;
    private String yourName;
    private String gender;
    private int health;
    private int power;
    private int armor;

    public StateEntity() {

    }

    public StateEntity(int charId ,String yourName, String gender, int health, int power, int armor) {
        this.charId = charId;
        this.yourName = yourName;
        this.gender = gender;
        this.health = health;
        this.power = power;
        this.armor = armor;
    }

    public String getYourName() {
        return yourName;
    }

    public void setYourName(String yourName) {
        this.yourName = yourName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getCharId() { return charId;  }

    public void setCharId(int charId) {   this.charId = charId;  }

    @Override
    public String toString() {
        return "StateInfo{" +
                "슬롯 ='" + charId + '\'' +
                "이름 ='" + yourName + '\'' +
                ", 성별 ='" + gender + '\'' +
                ", 체력 =" + health +
                ", 공격력 =" + power +
                ", 방어력 =" + armor +
                '}';
    }
}

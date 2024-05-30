package com.study.java_study.개인연습;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StateEntity {
    private int charId;
    private String yourName;
    private String gender;
    private int health;
    private int power;
    private int armor;
}

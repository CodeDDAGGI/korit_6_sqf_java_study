package com.study.java_study.ch12_추상화03;

public abstract class AbstractAuthority implements Authority { //implements 구현
    private String role;

    public AbstractAuthority() {
        role = DEFAULT_ROLE;
    }

    // ctrl + i 인터페이스
    // ctrl + o 전체

    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}

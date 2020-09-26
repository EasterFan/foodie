package com.easter.enums;

/**
 * @Author EasterFan working on 2020/9/26 8:40 下午
 * @Description
 * @Version 1.0
 */
public enum Gender {
    /**
     * gender
     */
    WOMAN(0,"女"),
    MAN(1,"男"),
    SECRET(2,"保密");

    public final String value;
    public final Integer type;

    Gender(Integer type, String value){
        this.type = type;
        this.value = value;
    }
}

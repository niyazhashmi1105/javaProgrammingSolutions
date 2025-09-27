package com.java.interview;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class UserSerialization {

    private String name;
    private int age;

    public UserSerialization(){}
    public UserSerialization(String name, int age){
        super();
        this.name = name;
        this.age = age;
    }
}

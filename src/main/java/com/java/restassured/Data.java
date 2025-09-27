package com.java.restassured;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Data {

    private String token;

    public Data(){}
    public Data(String token){
        super();
        this.token = token;
    }
}

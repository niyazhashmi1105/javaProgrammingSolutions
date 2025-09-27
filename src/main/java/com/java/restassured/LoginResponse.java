package com.java.restassured;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class LoginResponse {

    private String message;
    private Data data;

    public LoginResponse(){}
    public LoginResponse(String message, Data data){
        super();
        this.message = message;
        this.data = data;

    }
}

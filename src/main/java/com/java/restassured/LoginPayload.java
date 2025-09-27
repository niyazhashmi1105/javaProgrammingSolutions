package com.java.restassured;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginPayload {

    private String username;
    private String password;

    public LoginPayload(String username, String password){
        super();
        this.username = username;
        this.password = password;
    }
}

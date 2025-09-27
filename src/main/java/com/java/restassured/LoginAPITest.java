package com.java.restassured;

import com.google.gson.Gson;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class LoginAPITest {

    public static void main(String[] args) {

        LoginPayload loginPayload = new LoginPayload("iamfd","password");

        LoginResponse response = given().baseUri("http://64.227.160.186:9000/v1").and()
                .header("content-type","application/json").and()
                .body(convertToJson(loginPayload))
                .when().post("/login").as(LoginResponse.class);
        System.out.println(response);
        System.out.println(response.getMessage());
        System.out.println(response.getData().getToken());
    }

    private static String convertToJson(Object src){
        Gson gson = new Gson();
        return gson.toJson(src);
    }
}

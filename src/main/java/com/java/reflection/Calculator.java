package com.java.reflection;

public class Calculator {

    private int x=5;

    public int add(int a , int b){
        return a+b;
    }

    private String message(String message){
       return "Private Method: "+ message;
    }
    public static void demo(){
        System.out.println("demo");
    }

    Calculator(){
        System.out.println("Private Constructor");
    }
}

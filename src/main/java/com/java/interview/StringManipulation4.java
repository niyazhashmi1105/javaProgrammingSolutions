package com.java.interview;

public class StringManipulation4 {

    public static void main(String[] args) {

        String input = "$niyaz^hashmi";

        String result = input.replaceAll("[^a-zA-Z]"," ");

        System.out.println(result);

    }



}

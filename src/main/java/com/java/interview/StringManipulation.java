package com.java.interview;

public class StringManipulation {

    public static void main(String[] args) {

        double number = 123.567899;
        String input = String.valueOf(number);

        int indexOfDecimal = input.indexOf(".");

        System.out.println("Number of Digits After Decimal = "+(input.length()-indexOfDecimal-1));
    }
}

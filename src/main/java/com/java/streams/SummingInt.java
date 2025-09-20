package com.java.streams;

public class SummingInt {

    public static void main(String[] args) {

        int num  = 12345;
        int sum = String.valueOf(num).chars().map(ch -> ch - '0').sum();
        System.out.println(sum);
    }
}

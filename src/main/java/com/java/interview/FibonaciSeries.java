package com.java.interview;

public class FibonaciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int third;
        int num = 0;

        while(num <=10){

            System.out.print(first+" ");
            third = first + second;
            first = second;
            second = third;
            num++;
        }
    }
}

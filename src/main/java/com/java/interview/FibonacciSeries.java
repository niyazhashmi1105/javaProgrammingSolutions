package com.java.interview;

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;
        int third;
        int num = 0;

        while(num <= 25){

            System.out.print(first+" ");
            third = first + second;
            first = second;
            second = third;
            num++;
        }
    }
}

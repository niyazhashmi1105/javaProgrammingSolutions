package com.java.interview;

public class EvenOrOdd {

    public static void main(String[] args) {

        int num = 8;

        while(num > 1){
            num = num-2;
        }
        if(num == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

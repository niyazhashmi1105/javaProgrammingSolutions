package com.java.interview;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153;
        System.out.println(findArmstrongNumber(num));
    }

    private static boolean findArmstrongNumber(int num) {

        int digit = num;
        int arm = 0;
        int number = 0;
        while(digit > 0){
            number = digit %10;
            arm = arm+ number * number * number;
            digit/=10;
        }
        if(arm == num){
            return true;
        }
        else{
            return false;
        }
    }
}

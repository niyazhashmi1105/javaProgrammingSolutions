package com.java.interview;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234;
        System.out.println(reverseNumber(num));
    }

    private static int reverseNumber(int num){

        int result = 0;
        if(num < 0){
            System.out.println("Enter positive number only");
            System.exit(0);
        }
        else {
            while ( num > 0 ) {
                result = result * 10 + ( num % 10 );
                num /= 10;
            }
        }
        return result;
    }
}

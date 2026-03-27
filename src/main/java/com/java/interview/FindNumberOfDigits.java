package com.java.interview;

public class FindNumberOfDigits {

    public static void main(String[] args) {

        int num = 5535;
        System.out.println(findNumberOfDigit(num));
    }

    private static int findNumberOfDigit(int num) {

        int count = 0;
        if(num < 0 || num == 0){
            return 1;
        }
        else{
             while( num > 0 ){
                 num /=  10;
                 count++;
             }
        }
        return count;
    }

}

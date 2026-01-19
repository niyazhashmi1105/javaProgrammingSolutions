package com.java.interview;

public class FindSecondLargestNumberFromString {

    public static void main(String[] args) {

        String input = "a1b2c03d";
        findSecondLargestNumber(input);
    }

    private static void findSecondLargestNumber(String input) {

        char [] data = input.toCharArray();
        int num;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(char ch : data){
            if(Character.isDigit(ch)){
                num = ch - '0';
                if(num > first){
                    second = first;
                    first = num;
                }
                else if(num > second && num < second){
                    second = num;
                }
            }
        }

        System.out.println("Second Largest Number: "+ second);
    }
}

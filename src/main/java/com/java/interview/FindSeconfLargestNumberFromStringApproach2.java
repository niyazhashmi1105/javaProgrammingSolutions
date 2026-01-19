package com.java.interview;

import java.util.TreeSet;

public class FindSeconfLargestNumberFromStringApproach2 {

    public static void main(String[] args) {

        String input = "0111a1b22c034d5";
        findSecondLargestNumber(input);
    }

    private static void findSecondLargestNumber(String input) {

        char [] data = input.toCharArray();
        int num;

        TreeSet<Integer> dataSet = new TreeSet<>();
        for(char ch : data){
            if(Character.isDigit(ch)){
                num = ch - '0';
                dataSet.add(num);
            }
        }

        System.out.println(dataSet);
        dataSet.pollLast();
        System.out.println("second largest number: "+ dataSet.last());

    }
}

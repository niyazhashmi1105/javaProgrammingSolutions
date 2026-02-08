package com.java.interview;

import java.util.TreeSet;

public class FindSecondLargestNumberFromStringApproach2 {

    public static void main(String[] args) {

        String input = "0111a1b22c036d5";
        //findSecondLargestNumber(input);
        getSecondLargestNumber(input);
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

    private static void getSecondLargestNumber(String input){

        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        int num = 0;
        for(char ch:input.toCharArray()){

            if(Character.isDigit(ch)){

                num = ch - '0';
                if(num > max){
                    secondLargest = max;
                    max = num;
                }
                else if(num > secondLargest && num != max){
                    secondLargest = num;
                }

            }

        }
        System.out.println(secondLargest);

    }
}

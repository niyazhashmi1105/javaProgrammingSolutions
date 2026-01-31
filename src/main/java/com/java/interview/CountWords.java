package com.java.interview;

public class CountWords {

    public static void main(String[] args) {

        String input = "";

        System.out.println(countWords(input));
    }

    private static int countWords(String str) {
        int count =0;

        if(str.isEmpty()){
            System.out.println("String is empty, please enter valid string with spaces");
        }
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                count++;
            }
        }
        return count;
    }
}

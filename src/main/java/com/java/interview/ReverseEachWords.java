package com.java.interview;

public class ReverseEachWords {

    public static void main(String[] args) {

        String str = "Java Python Javascript";

        String [] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word: arr){
            StringBuilder reverseWord = new StringBuilder();
            int j = word.length();
            while(j>0){
                char ch = word.charAt(j-1);
                reverseWord.append(ch);
                j--;
            }
            result.append(reverseWord).append(" ");
        }
        System.out.println("Reverse Words: "+result);
    }
}

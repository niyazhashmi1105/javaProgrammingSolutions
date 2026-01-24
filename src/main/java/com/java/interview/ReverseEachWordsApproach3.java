package com.java.interview;

public class ReverseEachWordsApproach3 {

    public static void main(String[] args) {

        String input = "This is fun";

        StringBuffer result = new StringBuffer();
        for(String words: input.split(" ")){
            StringBuffer word = new StringBuffer(words);
            result.append(word.reverse().append(" "));
        }
        System.out.println(result.toString().trim());
    }
}

package com.java.interview;

public class ReverseEachWordsApproach3 {

    public static void main(String[] args) {

        String input = "This is fun";

        StringBuilder result = new StringBuilder();
        for(String words: input.split(" ")){
            StringBuilder word = new StringBuilder(words);
            result.append(word.reverse().append(" "));
        }
        System.out.println(result.toString().trim());
    }
}

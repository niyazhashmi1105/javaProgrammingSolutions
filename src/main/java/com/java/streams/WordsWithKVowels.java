package com.java.streams;

import java.util.Arrays;

public class WordsWithKVowels {

    public static void main(String[] args) {

        String str = "I have an apple and orange on the table";
        int k =2;
        Arrays.stream(str.split(" ")).filter(word-> countVowels(word)==k)
                .forEach(System.out::println);
    }

    private static long countVowels(String word){
        return word.chars().mapToObj(ch->(char)ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch)!= -1)
                .count();
    }
}

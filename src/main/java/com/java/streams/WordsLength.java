package com.java.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordsLength {

    public static void main(String[] args) {

        String str = "welcome to java world";

        Map<String, Integer> wordCountMap  = Arrays.stream(str.split(" "))
                                                   .collect(Collectors.toMap(word -> word, String::length,
                                                           (existing,replacement)->existing, LinkedHashMap::new));
        System.out.println(wordCountMap);
    }
}

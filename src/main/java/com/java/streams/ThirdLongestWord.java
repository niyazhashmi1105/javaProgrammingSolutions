package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThirdLongestWord {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","banana","dragon fruit","pineapple");

        words.stream()
                .sorted((w1,w2)-> Integer.compare(w2.length(),w1.length())  )
                //.sorted(Comparator.comparingInt(String::length).reversed())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

    }
}

package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestString {

    public static void main(String[] args) {

        String str = "welcome to java streams";

        Optional<String> longestString = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length));

        longestString.ifPresent(System.out::println);
    }
}

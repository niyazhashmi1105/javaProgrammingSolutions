package com.java.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStringsUsingCustomDelimiter {

    public static void main(String[] args) {

        String [] str = {"apple","banana","grapes"};

        //String result = Arrays.stream(str).map(words -> "[" + words + "]")
                          //    .collect(Collectors.joining(","));

        String result = Arrays.stream(str).collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);
    }
}

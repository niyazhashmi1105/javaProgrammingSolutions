package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class StringsStartingWithNumber {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","1cherry","3blueberry","5grapes");

        list.stream()
                .filter(str -> !str.isEmpty() && !Character.isDigit(str.charAt(0)))
                .forEach(System.out::println);
    }

}

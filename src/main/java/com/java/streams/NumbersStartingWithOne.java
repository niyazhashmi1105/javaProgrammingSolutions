package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 19, 30, 58, 99, 120);

         nums.stream().filter(num -> !String.valueOf(num).startsWith("1")).forEach(System.out::println);
    }
}

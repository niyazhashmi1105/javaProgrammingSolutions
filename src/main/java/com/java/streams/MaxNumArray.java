package com.java.streams;

import java.util.Arrays;

public class MaxNumArray {

    public static void main(String[] args) {

        int [] nums ={30, 42, 89, 100, 67};

        Arrays.stream(nums).min().ifPresent(System.out::println);
        Arrays.stream(nums).max().ifPresent(System.out::println);
    }
}

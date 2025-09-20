package com.java.streams;

import java.util.Arrays;

public class LastNumberStream {

    public static void main(String[] args) {

        int [] nums = {10, 20,30, 40, 50};

        Arrays.stream(nums).skip(nums.length-1).findFirst().ifPresent(System.out::println);
    }
}

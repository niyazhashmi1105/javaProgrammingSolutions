package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfFirstTwoNum {

    public SumOfFirstTwoNum() {
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        //int sum = nums.stream().limit(2).mapToInt(Integer::intValue).sum();
        Optional<Integer> result = nums.stream().limit(2).reduce((a, b) -> a * b);
        result.ifPresent(System.out::println);

    }
}

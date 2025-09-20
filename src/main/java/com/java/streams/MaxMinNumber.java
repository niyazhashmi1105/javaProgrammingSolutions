package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinNumber {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,55,50);
        Optional<Integer> max = num.stream().max(Integer::compareTo);
        System.out.println(max.orElse(null));

        Optional<Integer> min = num.stream().min(Integer::compareTo);
        System.out.println(min.orElse(null));
    }
}

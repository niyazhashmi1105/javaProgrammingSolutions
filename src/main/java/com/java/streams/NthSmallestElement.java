package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NthSmallestElement {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10,6,2,9,1);
        int n = 3;
        nums.stream().sorted().skip(n-1).findFirst().ifPresent(System.out::println);

    }
}

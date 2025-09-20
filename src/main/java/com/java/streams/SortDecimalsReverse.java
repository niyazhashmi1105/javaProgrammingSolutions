package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalsReverse {

    public static void main(String[] args) {

        List<Double> nums = Arrays.asList(3.14,1.71,0.45,3.67,2.98,0.12);

        nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

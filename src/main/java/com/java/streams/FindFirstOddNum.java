package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class FindFirstOddNum {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(11,2,3,4,5,2);

        nums.stream().filter(ele -> ele %2 !=0).findFirst().ifPresent(System.out::println);
    }
}

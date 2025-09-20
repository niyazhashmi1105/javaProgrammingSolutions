package com.java.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,2};
        Set<Integer> hset = new HashSet<>();

        boolean isDuplicate = Arrays.stream(nums).anyMatch(ele -> !hset.add(ele));
        System.out.println("Array contain duplicate elements: "+isDuplicate);
    }
}

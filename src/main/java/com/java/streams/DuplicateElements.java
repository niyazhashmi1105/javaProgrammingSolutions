package com.java.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,1,3);
        Set<Integer> set = new HashSet<>();

        num.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    }
}

package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
        num.stream().findFirst().ifPresent(System.out::println);
    }
}

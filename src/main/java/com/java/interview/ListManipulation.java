package com.java.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListManipulation {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,123,20,null,49,100);
        List<Integer> list = numList.stream().filter(Objects::nonNull).filter(i -> i.toString().startsWith("1")).toList();
        System.out.println(list);
    }
}

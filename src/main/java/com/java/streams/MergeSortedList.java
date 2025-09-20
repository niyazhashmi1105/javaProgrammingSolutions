package com.java.streams;

import com.google.common.collect.Streams;

import java.util.Arrays;
import java.util.List;

public class MergeSortedList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

        Streams.concat(list1.stream(),list2.stream())
                .sorted()
                .forEach(System.out::println);
    }
}

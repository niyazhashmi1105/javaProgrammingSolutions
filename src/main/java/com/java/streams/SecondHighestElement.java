package com.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighestElement {

    public static void main(String[] args) {

        int [] arr = {1, 4, 5, 2, 3, 9, 8, 7, 8, 9, 7,4};
        Optional<Integer> secondHighest = Arrays.stream(arr)
                                                .boxed()
                                                 .sorted(Comparator.reverseOrder())
                                                 .distinct()
                                                 .skip(1)
                                                 .findFirst();
        secondHighest.ifPresent(System.out::println);
    }
}

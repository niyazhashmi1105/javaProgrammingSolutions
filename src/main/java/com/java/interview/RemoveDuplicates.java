package com.java.interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;


public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 2, 4, 1, 5));

        // Method 1: Using LinkedHashSet (preserves order)
        List<Integer> unique = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("Method 1: " + unique);

        // Method 2: Using Java 8 Stream
        List<Integer> unique2 = list.stream()
                                    .distinct()
                                    .toList();
        System.out.println("Method 2: " + unique2);

        // Method 3: Manual iteration
        List<Integer> unique3 = new ArrayList<>();
        for (int val : list) {
            if (!unique3.contains(val)) unique3.add(val);
        }
        System.out.println("Method 3: " + unique3);
    }
}

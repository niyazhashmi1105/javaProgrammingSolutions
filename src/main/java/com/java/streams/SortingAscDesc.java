package com.java.streams;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingAscDesc {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,21,3,40,5,6,75,8,9);

        System.out.println("Sorting in Ascending order");
        num.stream().sorted().forEach(System.out::println);

        System.out.println("Sorting in Descending order");
        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

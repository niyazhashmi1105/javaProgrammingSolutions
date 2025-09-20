package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfUniqueNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1);
        int sumOfUniqueNumbers = numbers.stream()
                                            .distinct()
                                                .mapToInt(Integer::intValue)
                                                    .sum();

        System.out.println(sumOfUniqueNumbers);

    }



}

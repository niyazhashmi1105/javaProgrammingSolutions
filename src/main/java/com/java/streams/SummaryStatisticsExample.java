package com.java.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatisticsExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(n -> n).summaryStatistics();

        System.out.println("Minimum "+intSummaryStatistics.getMin());
        System.out.println("Maximum "+intSummaryStatistics.getMax());
        System.out.println("Sum "+intSummaryStatistics.getSum());
        System.out.println("Average "+intSummaryStatistics.getAverage());
        System.out.println("Count "+intSummaryStatistics.getCount());
    }
}

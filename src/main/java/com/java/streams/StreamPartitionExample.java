package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitionExample {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,14);
        Map<Boolean, List<Integer>> partitioned = numList.stream().collect(Collectors.partitioningBy(ele -> ele % 2 == 0));
        System.out.println("Even Numbers: "+partitioned.get(true));
        System.out.println("Odd Numbers: "+partitioned.get(false));
    }
}

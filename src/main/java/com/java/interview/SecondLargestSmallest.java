package com.java.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestSmallest {

    public static void main(String[] args) {

        Integer[] arr = {12, 35, 1, 10, 34, 33};
        List<Integer> list = Arrays.asList(arr);

        Collections.sort(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        //System.out.println("Second Largest: " + list.get(list.size() - 2));
        //System.out.println("Second Smallest: " + list.get(1));

        int secondLargest = Arrays.stream(arr)
                                    .distinct()
                                    .sorted()
                                    .skip(arr.length-2)
                                    .findFirst().orElse(-1);


        int secondSmallest = Arrays.stream(arr)
                                    .distinct()
                                    .sorted()
                                    .skip(1)
                                    .findFirst()
                                    .orElse(-1);

        System.out.println("Second Largest: " +secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

}

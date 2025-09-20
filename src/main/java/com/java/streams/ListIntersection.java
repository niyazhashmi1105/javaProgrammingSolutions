package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class ListIntersection {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(6,7,8,4,5);

        List<Integer> intersectionList = list1.stream().filter(list2::contains).toList();

        System.out.println(intersectionList);

    }
}

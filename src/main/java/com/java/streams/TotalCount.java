package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class TotalCount {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(num.stream().count());
    }
}

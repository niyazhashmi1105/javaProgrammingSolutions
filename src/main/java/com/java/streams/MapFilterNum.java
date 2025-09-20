package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class MapFilterNum {

    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
        num.stream().map(n -> n*n).filter(n-> n>50).forEach(System.out::println);
    }
}

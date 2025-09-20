package com.java.streams;

import java.util.Arrays;

public class SortAndConvertToStreamArray {

    public static void main(String[] args) {

        int []nums ={5,2,3,1,4};

        Arrays.sort(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}

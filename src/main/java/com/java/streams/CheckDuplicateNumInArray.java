package com.java.streams;

import java.util.Arrays;

public class CheckDuplicateNumInArray {

    public static void main(String[] args) {
        int []nums ={1,2,3,4,5};

        if(Arrays.stream(nums).distinct().count()!= nums.length)
            System.out.println("It contain duplicate value");
        else
            System.out.println("It contain unique value");
    }
}

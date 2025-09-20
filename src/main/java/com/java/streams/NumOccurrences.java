package com.java.streams;

import java.util.Arrays;

public class NumOccurrences {

    public static void main(String[] args) {
        int [] nums = {1, 10, 20, 30, 40, 10, 20, 30, 10, 10, 10};
        int num = 10;

        long result = Arrays.stream(nums).filter(val -> val == num).count();
        System.out.println(result);
    }
}

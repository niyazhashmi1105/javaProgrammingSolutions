package com.java.interview;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int []arr = {1,0,2,0};
        int nonZeroIndex =0;

        for(int i =0;i<arr.length;i++){

            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}

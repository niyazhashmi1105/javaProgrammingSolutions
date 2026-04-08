package com.java.interview;

import java.util.Arrays;

public class RotateArrayLeftByKthPosition {

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int k = 2;
        k = k % a.length;
        System.out.println(k);
        a = rotateArray(a, 0, k-1); // Reverse first 2 elements [2,1,3,4,5]
        a = rotateArray(a, k,a.length-1); // Reverse remaining elements [2,1,5,4,3]
        a = rotateArray(a,0,a.length-1); // Reverse whole array [3,4,5,1,2]
        System.out.println(Arrays.toString(a));
    }

    private static int[] rotateArray(int[] a, int left, int right) {

        while( left < right ) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }
}

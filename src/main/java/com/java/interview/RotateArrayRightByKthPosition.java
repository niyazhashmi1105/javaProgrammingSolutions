package com.java.interview;

import java.util.Arrays;

public class RotateArrayRightByKthPosition {

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5};
        int k = 2;
        int left = 0;
        int right = a.length-1;
        k = k % a.length;
        a = rotateArrayRight(a,left,right); // Reverse whole array [7,6,5,4,3,2,1]
        a = rotateArrayRight(a,0, k-1); // Reverse First 2 elements [6,7,5,4,3,2,1]
        a = rotateArrayRight(a,k,a.length-1); // Reverse Remaining elements [6,7,1,2,3,4,5]
        System.out.println(Arrays.toString(a));

    }

    private static int[] rotateArrayRight(int[] a, int left, int right) {

        int temp ;
        while(left < right){
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }

}

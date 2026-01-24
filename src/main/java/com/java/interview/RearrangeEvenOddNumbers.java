package com.java.interview;

import java.util.Arrays;

public class RearrangeEvenOddNumbers {

    public static void main(String[] args) {

        int a[] = {1,0,2,7,0,4,3,5,4,3,6,9};
        int left = 0;
        int right = a.length-1;
        int evenEnd = 0;

        System.out.println("Original Array: "+Arrays.toString(a));

        while(left < right){
            while(left < right && a[left] % 2 == 0){
                left++;
            }
            while(left < right && a[right] % 2 != 0){
                right--;
            }

            if(left<right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
            }

        }

        System.out.println("Arrays Before Sorting: "+ Arrays.toString(a));
        while(evenEnd < a.length-1 && a[evenEnd] % 2 == 0){
            evenEnd++;
        }
        System.out.println(evenEnd);
        Arrays.sort(a,0,evenEnd);
        Arrays.sort(a, evenEnd,a.length-1);
        System.out.println("Arrays After Sorting: "+ Arrays.toString(a));

    }
}

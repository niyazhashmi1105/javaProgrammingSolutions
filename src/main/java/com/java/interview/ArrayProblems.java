package com.java.interview;

import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {

        int []a = {4,5,3,10,7,2};
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Total sum of Array Elements
        for(int value: a){
            sum = sum+value;
        }

        System.out.println("Total Sum: "+ sum);

        // Find Largest and Second Largest Elements
        for(int num: a){
            if( num > largest){
                secondLargest = largest;
                largest = num;
            }
            if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }

        System.out.println("Largest: "+ largest);
        System.out.println("Second Largest: "+ secondLargest);

        // Reverse First and Second  Half of the Array
        int mid = a.length/2;
        int left = 0;                                     //int left = mid;
        int right = mid -1;                             //int right = a.length-1;

        while(left < right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));
    }
}

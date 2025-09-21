package com.java.interview;

public class MonotonicArray {

    public static void main(String[] args) {

        int [] arr = {11,10,9,7};
        isMonotonic(arr);
    }

    private static void isMonotonic(int[] arr) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1; i<arr.length;i++){
            if(arr[i-1] < arr[i]){
                decreasing = false;
            }
            else if(arr[i-1] > arr[i]){
                increasing = false;
            }
        }
        if(increasing || decreasing){
            System.out.println("It's a monotonic array");
        }
        else{
            System.out.println("It's not a monotonic array");
        }
    }
}

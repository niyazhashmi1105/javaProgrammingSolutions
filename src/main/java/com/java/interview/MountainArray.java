package com.java.interview;

public class MountainArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,2,3,2,0};
        System.out.println(isMountainArray(arr));
    }

    private static boolean isMountainArray(int[] arr) {

        if(arr.length < 2){
            return false;
        }
        int i =0;
        while(i+1 < arr.length && arr[i] < arr[i+1]) {
           i++;

        }
        while(i+1 < arr.length && arr[i] > arr[i+1]) {
            i++;
        }

        return arr.length -1 == i;
    }
}

package com.java.interview;

public class FindLeaderNumberInArray {

    public static void main(String[] args) {
            int []arr = {16,17,4,3,5,2};
            getLeaderNumber(arr);
    }

    private static void getLeaderNumber(int[] arr) {

        int length = arr.length;
        int maxRight = arr[length-1];
        System.out.println(maxRight);

        for(int index = length-2; index >=0 ;index--){
            if(arr[index] > maxRight){
                maxRight = arr[index];
                System.out.println(maxRight);
            }
        }
    }
}

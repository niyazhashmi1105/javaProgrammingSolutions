package com.java.interview;

public class MissingNumber {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        int sum =0, numSum=0, missingNumber = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        for(int i=1;i<=10;i++){
            numSum = numSum + i;
        }
        missingNumber = numSum - sum;

        System.out.println("Missing Number: "+ missingNumber);
    }
}

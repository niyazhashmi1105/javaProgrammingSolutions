package com.java.interview;

public class LargestSmallestNumber {

    public static void main(String[] args) {

        int [] arr = {11, 2, 67, 46, 78, 97, 100, 32, 5};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i=1;i<arr.length;i++){

            if(arr[i] > largest)
                largest = arr[i];
            else if(arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("Largest Number: "+ largest);
        System.out.println("Smallest Number: "+ smallest);
    }
}

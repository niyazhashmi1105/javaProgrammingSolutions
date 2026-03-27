package com.java.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber2 {

    public static void main(String[] args) {
        int [] arr = {1, 3,5,6,7};
        int max = arr.length;
        Arrays.sort(arr);
        Set<Integer> hashSet = new HashSet<>();
        for(int i=0;i<=max+1;i++ ){
            if(!hashSet.contains(i)){
                System.out.print(i+" ");
            }
        }


    }
}

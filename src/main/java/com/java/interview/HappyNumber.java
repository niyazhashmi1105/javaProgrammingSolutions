package com.java.interview;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        int num = 25;
        System.out.println(isHappy(num));
    }

    private static boolean isHappy(int num) {

        Set<Integer> hs = new HashSet<>();

        while(!hs.contains(num)){
            hs.add(num);
            int sqrSum = 0;
            while(num != 0){
                int rem = num % 10;
                sqrSum += rem * rem;
                num /= 10;
            }
            if(sqrSum == 1) return true;
            else num = sqrSum;
        }
        return false;
    }
}

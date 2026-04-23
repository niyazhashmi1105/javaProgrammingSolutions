package com.java.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int a[] = {2,11,7,15};
        int target = 18;
        System.out.println(Arrays.toString(findTwoSum(a, target)));
    }

    private static int[] findTwoSum(int [] a, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<a.length;i++){
            int comp = target - a[i];
            map.put(a[i],i);
            //System.out.println(map);

            if(map.containsKey(comp)){
                return new int []{map.get(comp),i};
            }
        }
        return new int[0];
    }

}

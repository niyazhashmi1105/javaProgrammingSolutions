package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 1, 5, 6, 8, 9, 7, 8};
        findDuplicates(arr);
    }

    public static void findDuplicates(int [] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            if (!map.containsKey(j))
                map.put(j, 1);
            else
                map.put(j, map.get(j) + 1);
        }

        for(int key: map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println("Duplicate Element: "+key);
            }
        }
    }

}

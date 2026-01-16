package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

    public static void main(String[] args) {

        Map<String,Integer> ogMap = new HashMap<>();
        ogMap.put("A",1);
        ogMap.put("B",2);
        ogMap.put("C",3);

        System.out.println(ogMap);

        Map<Integer,String> reverseMap = new HashMap<>();
        for(Map.Entry<String,Integer> data: ogMap.entrySet()){
            reverseMap.put(data.getValue(), data.getKey());
        }
        System.out.println(reverseMap);
    }
}

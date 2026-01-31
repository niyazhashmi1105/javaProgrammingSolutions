package com.java.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AnagramApproach3 {

    public static void main(String[] args) {

        String str1 = "TOPs";
        String str2 = "stop";
        System.out.println(isAnagram(str1,str2));
    }
    private static boolean isAnagram(String str1, String str2){

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c: str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
        for(char c: str2.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c)-1);
            if(map.get(c) == 0){
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
}

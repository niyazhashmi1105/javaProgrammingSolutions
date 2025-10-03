package com.java.interview;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountDuplicateCharacter {

    public static void main(String[] args) {

        String str = "java is not pure OOP language";
        char[] ch = str.toCharArray();

        Map<Character,Integer> charCountMap = new LinkedHashMap<>();
        for (char c : ch) {
            if (!charCountMap.containsKey(c)) {
                charCountMap.put(c, 1);
            } else {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
        }

        //System.out.println(charCountMap.keySet());

        for(Character key: charCountMap.keySet()){
            if(charCountMap.get(key) > 1){
                System.out.println("Key "+key+" : "+ charCountMap.get(key));
            }
        }
    }
}

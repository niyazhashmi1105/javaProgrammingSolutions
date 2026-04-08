package com.java.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "python is sweet programming";

        Map<Character, Integer> countCharacterMap = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            countCharacterMap.put(str.charAt(i), countCharacterMap.getOrDefault(str.charAt(i), 0) + 1);
        }


        for(Map.Entry<Character,Integer> entry: countCharacterMap.entrySet()){

            if(entry.getValue() == 1){
                System.out.println("First Non Repeated Character: "+entry.getKey());
                break;
            }
        }

    }
}

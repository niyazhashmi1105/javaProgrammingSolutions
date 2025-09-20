package com.java.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "jjava is sweet programming";

        Map<Character, Integer> countCharacterMap = new LinkedHashMap<>();
        int count =1;

        for(int i=0;i<str.length();i++){
            if(!countCharacterMap.containsKey(str.charAt(i))){
                countCharacterMap.put(str.charAt(i),count);
            }
            else{
                countCharacterMap.put(str.charAt(i),countCharacterMap.get(str.charAt(i))+1);
            }
        }

        for(Map.Entry<Character,Integer> entry: countCharacterMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First Non Repeated Character: "+entry.getKey());
                break;
            }
        }

    }
}

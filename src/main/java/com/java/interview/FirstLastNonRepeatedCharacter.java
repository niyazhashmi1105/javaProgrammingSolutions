package com.java.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstLastNonRepeatedCharacter {

    public static void main(String[] args) {

        String str = "Java is pure OOPS language";

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

        for(int i= str.length()-1; i>= 0; i--){
            if(countCharacterMap.get(str.charAt(i)) == 1){
                System.out.println("Last Non Repeating Character: "+ str.charAt(i));
                break;
            }
        }

    }
}

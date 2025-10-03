package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfSpecialCharacters {

    public static void main(String[] args) {

        String str = "1abc@#$&*^(#@$";
        getSpecialCharactersCount(str);
    }

    private static void getSpecialCharactersCount(String str) {

        char[] chArray = str.toCharArray();
        Map<Character,Integer> specialCharCountMap = new HashMap<>();

        for(char ch:chArray){
            if(!((ch >= 'a'&& ch <='z')||(ch >='A' && ch <= 'Z') || (ch >='0' && ch <='9')||(ch ==' '))) {
                if (!specialCharCountMap.containsKey(ch)) {
                    specialCharCountMap.put(ch,1);
                } else {
                    specialCharCountMap.put(ch, specialCharCountMap.get(ch) + 1);
                }
            }
        }

        for(char ch: specialCharCountMap.keySet()){
            System.out.println("Special character: "+ch +" count: "+specialCharCountMap.get(ch));
        }
    }
}

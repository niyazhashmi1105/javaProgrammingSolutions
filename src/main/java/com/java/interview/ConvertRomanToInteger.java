package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToInteger {

    public static void main(String[] args) {

        String str ="MC";
        System.out.println(convertRomanToInteger(str));
    }

    private static int convertRomanToInteger(String str) {

        Map<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('C',100);
        romanMap.put('M',1000);

        int result = 0;
        int previousValue = 0;

        for(int i= str.length()-1 ;i >= 0; i--){

            char currentChar = str.charAt(i);
            int  currentValue = romanMap.get(currentChar);

            if(currentValue >= previousValue){
                result = result + currentValue;
            }
            else{
                result = result - currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }
}

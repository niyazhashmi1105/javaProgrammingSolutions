package com.java.interview;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharacter {

    public static void main(String[] args) {

        String input = "aaabbbc";
        Map<Character,Integer> map = new HashMap<>();
        int firstMaxFrequency = Integer.MIN_VALUE;
        int secondMaxFrequency = Integer.MIN_VALUE;

        for(char ch: input.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){

            int currentFrequency = entry.getValue();

            if(currentFrequency > firstMaxFrequency){

                secondMaxFrequency = firstMaxFrequency;
                firstMaxFrequency = currentFrequency;
            }
            else if(currentFrequency > secondMaxFrequency && currentFrequency < firstMaxFrequency){
                secondMaxFrequency = currentFrequency;
            }

        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){

            if(entry.getValue() == secondMaxFrequency){
                System.out.println(entry.getKey()+" "+secondMaxFrequency);
            }

        }

    }
}

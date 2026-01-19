package com.java.interview;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWords {

    public static void main(String[] args) {

        String input = "Hi My name name is Niyaz Niyaz";

        Map<String,Integer> countMap = new LinkedHashMap<>();
        for(String word: input.split(" ")){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String,Integer> wordMap: countMap.entrySet()){
            System.out.println(wordMap.getKey()+" "+wordMap.getValue());
        }
    }
}

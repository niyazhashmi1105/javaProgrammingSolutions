package com.java.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordsCount {

    public static void main(String [] args)
    {
        //count words in a string

        String str = "Java java is is a great great programming language language";
        Map<String,Integer> wordCountMap = new LinkedHashMap<>();
        String [] words = str.split(" ");

        for(String word : words) {
            word = word.toLowerCase();
            if(!wordCountMap.containsKey(word)) {
                wordCountMap.put(word, 1);
            } else {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            }
        }

        //System.out.println(wordCountMap.entrySet());
        for(String key : wordCountMap.keySet()) {
            if(wordCountMap.get(key) > 1)
                System.out.println( key+ " : " + wordCountMap.get(key));
        }

    }
}

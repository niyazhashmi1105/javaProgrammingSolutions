package com.java.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsFrequency {

    public static void main(String[] args) {

        String str = "java python javascript java html c++ c";

        Map<String, Long> wordCountMap = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       wordCountMap.forEach((word,count)->System.out.println(word+ " : "+count));
    }
}

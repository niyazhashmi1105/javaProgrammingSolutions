package com.java.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountOccurrence {

    public static void main(String[] args) {
        String words = "niyaz hashmi";
        Map<Character,Long> charCount = words.chars()
                                             .mapToObj(c->(char)c)
                                            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

    charCount.forEach((character,count)-> System.out.println("Character: "+character+" ,count: "+count));

    }
}

package com.java.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "interview";

                str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch-> ch, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry :: getKey)
                        .findFirst().ifPresent(System.out::println);

    }
}

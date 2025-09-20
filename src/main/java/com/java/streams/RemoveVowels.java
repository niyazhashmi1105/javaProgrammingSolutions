package com.java.streams;

import java.util.stream.Collectors;

public class RemoveVowels {

    public static void main(String[] args) {

        String str = "HelloWorld";

        String result = str.chars()
                .filter(ch ->"aeiouAEIOU".contains(String.valueOf((char)ch)))
                        .mapToObj(ch -> String.valueOf((char)ch))
                            .collect(Collectors.joining());

        System.out.println(result);

    }

}

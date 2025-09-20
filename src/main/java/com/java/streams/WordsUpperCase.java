package com.java.streams;

import java.util.Arrays;
import java.util.List;

public class WordsUpperCase {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("niyaz","hashmi","testing");
        words.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

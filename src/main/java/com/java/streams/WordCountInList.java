package com.java;

import java.util.Arrays;
import java.util.List;

public class WordCountInList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("java python c c++","Springboot java spark"
                ,"mongo oracle sql java","java html javascript java java");

        long count = list.stream().flatMap(word -> Arrays.stream(word.split(" ")))
                .filter(word -> word.equalsIgnoreCase("java"))
                .count();

        System.out.println(count);

    }
}

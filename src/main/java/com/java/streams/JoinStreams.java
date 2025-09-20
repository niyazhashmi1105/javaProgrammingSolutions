package com.java.streams;

import com.google.common.collect.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JoinStreams {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);

        Streams.concat(list1.stream(), list2.stream()).forEach(System.out::println);

    }
}

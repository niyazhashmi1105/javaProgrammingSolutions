package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class IsListEmpty {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Niyaz","Hashmi","Testing");

        Optional<List<String>> optional = Optional.ofNullable(str);

        optional.ifPresentOrElse(s-> s.stream().forEach(System.out::println),()->System.out.println("list is empty"));
    }

}

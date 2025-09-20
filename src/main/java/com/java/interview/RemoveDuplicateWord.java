package com.java.interview;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

    public static void main(String[] args) {

        String str = "how are are you you";

        String [] inputArr = str.split(" ");

        Set<String> duplicateSet = new LinkedHashSet<>(Arrays.asList(inputArr));

        for (String s : duplicateSet) {
            System.out.print(s + " ");
        }
    }
}

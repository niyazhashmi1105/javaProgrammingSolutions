package com.java.interview;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {

    public static void main(String[] args) {

        String str = "Welcome to Java World";
        getUnqiueCharacters(str);
    }

    private static void getUnqiueCharacters(String str) {

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }

        }
        sb.append(set);
        System.out.println(sb.toString());

    }
}

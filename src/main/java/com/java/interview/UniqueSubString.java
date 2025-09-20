package com.java.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueSubString {

    public static void main(String[] args) {
        String str = "aaabbcddcaab";
        System.out.println(getUniqueSubString(str));
    }

    private static StringBuilder getUniqueSubString(String str){

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        char [] ch = str.toCharArray();

        for(char currentChar:ch){
            set.add(currentChar);
        }

        for(char character:set){
            sb.append(character);
        }
        return sb;
    }

}

package com.java.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestUniqueSubString {

    public static void main(String[] args) {
        String str = "programming language"; //progamin,langue
        System.out.println(getLongestUniqueSubstring(str));

    }

    private static String getLongestUniqueSubstring(String str) {

        int left = 0;
        int maxLength = 0;
        int start = 0;
        Set<Character> set = new LinkedHashSet<>();

        for(int right = 0; right < str.length(); right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            if(right - left + 1 > maxLength){
                maxLength = right - left + 1;
                start = left;
            }
        }

        System.out.println(maxLength);
       return str.substring(start,start+maxLength);
    }
}

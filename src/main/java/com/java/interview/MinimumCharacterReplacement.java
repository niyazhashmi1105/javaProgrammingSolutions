package com.java.interview;

import java.util.Arrays;

public class MinimumCharacterReplacement {

    public static void main(String[] args) {

        String words[] = {"ab","aab","abb","abab","abaaaba"};
        int result[] = new int[words.length];

        for(int i =0;i<words.length;i++) {

            String input = words[i];
            int count = 0;
            int index = 1;

            while (index < input.length()) {
                if (input.charAt(index) == input.charAt(index - 1)) {
                    count = count + 1;
                    index = index + 2;
                } else {
                    index = index + 1;
                }
            }
                result[i] = count;
        }
        System.out.println(Arrays.toString(result));
    }
}

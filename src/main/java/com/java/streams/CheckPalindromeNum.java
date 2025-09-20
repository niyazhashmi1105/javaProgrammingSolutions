package com.java.streams;

import java.util.stream.IntStream;

public class CheckPalindromeNum {

    public static void main(String[] args) {

        String input = "madam";
        boolean isPalindrome = IntStream.range(0, input.length() / 2)
                .allMatch(i -> input.charAt(i) == input.charAt(input.length() - 1 - i));
        System.out.println(isPalindrome);

        System.out.println(input.length() / 2);
        for(int i=0;i<(input.length())/2;i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                System.out.println(input+ " is not palindrome");
                return;
            }
        }
        System.out.println(input+ " is palindrome");
    }
}

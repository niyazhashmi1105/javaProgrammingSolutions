package com.java.interview;

public class PalindromeApproach3 {

    public static void main(String[] args) {

        String str = "race a car";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str){

        char [] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        if(str.length()<=1){
            return true;
        }
        while(start < end){

            while(start < end && !Character.isLetterOrDigit(ch[start])){
                start++;
            }

            while(start < end && !Character.isLetterOrDigit(ch[end])){
                end--;
            }

            if(Character.toLowerCase(ch[start]) != Character.toLowerCase(ch[end])){
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}

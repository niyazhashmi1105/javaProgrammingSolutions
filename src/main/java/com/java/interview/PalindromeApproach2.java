package com.java.interview;

public class PalindromeApproach2 {

    public static void main(String[] args) {

        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str){

        int start = 0;
        int end = str.length()-1;

        if(str.length()<=1){
            return true;
        }
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

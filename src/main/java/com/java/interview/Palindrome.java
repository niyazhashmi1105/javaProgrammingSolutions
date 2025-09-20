package com.java.interview;

public class Palindrome {

    public static void main(String[] args) {

        String str = "racecar123";
        //System.out.println("Length "+ str.length());
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){

        if (str == null)
                return false;

        if(str.length() <=1){
            return true;
        }
        String firstChar = str.substring(0,1);
        String lastChar = str.substring(str.length()-1,str.length());

        if(!firstChar.equalsIgnoreCase(lastChar)){
            return false;
        }
        else{
            return isPalindrome(str.substring(1,str.length()-1));
        }
    }
}

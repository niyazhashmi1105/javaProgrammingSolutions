package com.java.interview;


public class ReverseOnlyVowels {

    public static void main(String[] args) {

        String str = "Hello";

        System.out.println(getReverseOnlyVowels(str));
    }

    private static String getReverseOnlyVowels(String str) {

        String vowels = "aeiouAEIOU";
        char []ch = str.toCharArray();
        char temp;
        int left =0;
        int right = ch.length-1;

        while(left < right){
            if(vowels.indexOf(ch[left])== -1){
                left++;
            }

            else if(vowels.indexOf(ch[right])== -1){
                right--;
            }
            else{
                temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        return new String(ch);

    }

}

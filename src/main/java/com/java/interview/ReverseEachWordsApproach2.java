package com.java.interview;

public class ReverseEachWordsApproach2 {

    public static void main(String[] args) {

        String input = "This is fun";
        System.out.println(reverseEachWord(input));
    }

    private static String reverseEachWord(String input) {

        String [] words = input.split(" ");
        StringBuffer result = new StringBuffer();
        for(String word: words){
            char [] ch = word.toCharArray();

            int left = 0;
            int right = ch.length-1;
            char temp;
            while(left < right){
               temp = ch[left];
               ch[left] = ch[right];
               ch[right] = temp;
               left++;
               right--;
            }
            result.append(ch).append(" ");
        }
        return result.toString();
    }
}

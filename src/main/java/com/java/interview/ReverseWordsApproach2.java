package com.java.interview;

import java.util.Arrays;

public class ReverseWordsApproach2 {

    public static void main(String[] args) {

        String []str = {"We", "are", "learning","the", "Java"};
        System.out.println("Original Array: "+Arrays.toString(str));
        System.out.println("Manipulative Array: "+reverseWords(str));
    }

    public static String reverseWords(String []str){

        int left = 0;
        int right = str.length-1;
        String temp;

        while(left < right){
            temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left ++;
            right--;
        }
        return Arrays.toString(str);

    }

}

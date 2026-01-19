package com.java.interview;

public class ReverseWords {

    public static void main(String[] args) {

        String str = "We are learning Java";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str){

        String [] arr = str.split(" ");
        String result = "";

        for(int i=arr.length-1;i>=0;i--){
            result += arr[i] + " ";
        }
        return result;

    }

}

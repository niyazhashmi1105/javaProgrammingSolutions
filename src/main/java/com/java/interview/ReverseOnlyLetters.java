package com.java.interview;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

        String str = "1abc2d3";
        System.out.println(getRevereLettersOnly(str));
    }

    private static String getRevereLettersOnly(String str){

        char [] ch = str.toCharArray();

        int left =0;
        int right = ch.length -1;
        char temp;

        while(left < right){

            if(!Character.isLetter(ch[left])){
                left++;

            }
            else if(!Character.isLetter(ch[right])){
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

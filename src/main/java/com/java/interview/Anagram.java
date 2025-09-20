package com.java.interview;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "stop";
        String str2 = "Tops";


        char []ch1 = str1.toLowerCase().toCharArray();
        char []ch2 = str2.toLowerCase().toCharArray();

        if(ch1.length == ch2.length){
            Arrays.sort(ch1);
            Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("Both strings are Anagram");
        }
        else{
            System.out.println("Both strings aren't Anagram");
        }

        }
        else{
            System.out.println("Length of both strings must be same");
        }
    }
}

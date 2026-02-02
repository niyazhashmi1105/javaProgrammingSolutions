package com.java.interview;

public class PrintEvenIndexedCharacters {

    public static void main(String[] args) {

        String str = "Automation";
        getEvenIndexedCharacters(str);
    }

    private static void getEvenIndexedCharacters(String str) {

        for(int i=0;i<str.length();i++){
            if(i%2 == 0){
                System.out.print(str.charAt(i));
            }
        }
    }
}

package com.java.interview;

public class RemoveSpaces {

    public static void main(String[] args) {

        String str = "Welcome to Java";
        removeSpaces(str);
    }

    private static void removeSpaces(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i =0;i< str.length();i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());


    }
}

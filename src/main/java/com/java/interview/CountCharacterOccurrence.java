package com.java.interview;

public class CountCharacterOccurrence {

    public static void main(String[] args) {

        String str = "Java is object oriented programming language";
        //System.out.println(str.length());
        //System.out.println( str.replaceAll("e", "").length());

        //int characterCount = str.length() - str.replaceAll("e", "").length();
        System.out.println(getCharacterCount(str,"a"));
    }

    private static int getCharacterCount(String str,String characterToCount){

        return str.length()- str.replaceAll(characterToCount,"").length();

    }
}

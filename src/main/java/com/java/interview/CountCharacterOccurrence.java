package com.java.interview;

public class CountCharacterOccurrence {

    public static void main(String[] args) {

        String str = "Java is object oriented programming language";
        //System.out.println(str.length());
        //System.out.println( str.replaceAll("a", "").length());
        System.out.println(getCharacterCount(str,"a"));
    }

    static int getCharacterCount(String str, String stringToReplace){


        return str.length()- str.replaceAll(stringToReplace,"").length();

    }
}

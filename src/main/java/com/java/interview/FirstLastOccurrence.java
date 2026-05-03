package com.java.interview;

public class FirstLastOccurrence {
    public static void main(String[] args) {

        String str = "mazonaanazzz";
        char   target = 'a';

        int first = str.indexOf(target);
        int last  = str.lastIndexOf(target);

        if (first == -1) {
            System.out.println("'" + target + "' not found in string");
        } else {
            System.out.println("String  : " + str);
            System.out.println("First '" + target + "' at index : " + first);
            System.out.println("Last  '" + target + "' at index : " + last);
        }
    }
}
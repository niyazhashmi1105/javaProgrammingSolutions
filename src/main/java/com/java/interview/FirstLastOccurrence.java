package com.java.interview;

public class FirstLastOccurrence {
    public static void main(String[] args) {

        String str = "amazonaanazzz";
        char  target = 'a';

        int first = str.indexOf(target);
        int last  = str.lastIndexOf(target);
        int next = str.indexOf('a',first+1);

        if (first == -1) {
            System.out.println("'" + target + "' not found in string");
        } else {
            System.out.println("String  : " + str);
            System.out.println("First '" + target + " at index : " + first);
            System.out.println("Next '" + target + " at index : " + next);
            System.out.println("Last  '" + target + " at index : " + last);
        }
    }
}
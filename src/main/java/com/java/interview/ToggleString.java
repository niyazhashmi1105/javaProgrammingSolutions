package com.java.interview;

public class ToggleString {

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println(toggleString(str));
    }

    private static String toggleString(String str) {

        char [] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(char c: ch) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

package com.java.interview;

public class DisplayLowerUpperCaseLettersOnly {

    public static void main(String[] args) {

        String str = "aBACdEabcD$%^&";
        showLowerUpper(str);
    }

    private static void showLowerUpper(String str) {
        StringBuilder lowerCaseBuilder = new StringBuilder();
        StringBuilder upperCaseBuilder = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                lowerCaseBuilder.append(ch);
            }
            else if(Character.isUpperCase(ch)){
                upperCaseBuilder.append(ch);
            }
        }
        System.out.println(lowerCaseBuilder);
        System.out.println(upperCaseBuilder);

    }

}

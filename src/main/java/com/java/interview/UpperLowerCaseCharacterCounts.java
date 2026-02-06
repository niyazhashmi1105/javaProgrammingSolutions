package com.java.interview;



public class UpperLowerCaseCharacterCounts {

    public static void main(String[] args) {

        String str = "abAcBCd";
        System.out.println("Original String: "+str);
        getCharactersCount(str);
    }

    private static void getCharactersCount(String str) {

        char [] charArray = str.toCharArray();
        int upperCount = 0;
        int lowerCount = 0;

        try {
            if (str.isEmpty()|| str.length() == 0) {
                System.out.println("String is empty,characters count not possible...");
            } else {
                for (char currentChar : charArray) {
                    if (Character.isUpperCase(currentChar)) {
                        upperCount++;
                    } else if (Character.isLowerCase(currentChar)) {
                        lowerCount++;
                    }
                }
                System.out.println("Upper case characters count: " + upperCount);
                System.out.println("Lower case characters count: " + lowerCount);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

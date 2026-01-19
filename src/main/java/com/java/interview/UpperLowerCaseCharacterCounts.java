package com.java.interview;



public class UpperLowerCaseCharacterCounts {

    public static void main(String[] args) {

        String str = "aAbCcDB";
        getCharactersCount(str);
    }

    private static void getCharactersCount(String str) {

        char [] charArray = str.toCharArray();
        int upperCount = 0;
        int lowerCount = 0;

        try {
            if (str.isEmpty()) {
                System.out.println("String is empty,characters count not possible...");
            } else {
                for (char temp : charArray) {
                    if (Character.isUpperCase(temp)) {
                        upperCount++;
                    } else if (Character.isLowerCase(temp)) {
                        lowerCount++;
                    }
                }
                System.out.println("Upper case characters count: " + upperCount + " Lower case characters count: " + lowerCount);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

package com.java.interview;

public class SeparateAlphabetsDigits {

    public static void main(String[] args) {

        String str = "Niy1234a56z%&*";
        getAlphabetsAndDigitsSeparately(str);
    }

    private static void getAlphabetsAndDigitsSeparately(String str) {

        char [] ch = str.toCharArray();
        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialCharacters = new StringBuilder();

        for(char currentChar: ch){
            if(Character.isDigit(currentChar)){
                digits.append(currentChar);
            }
            else if(Character.isAlphabetic(currentChar)){
                alphabets.append(currentChar);
            }
            else if(!Character.isAlphabetic(currentChar) && !Character.isDigit(currentChar)){
                specialCharacters.append(currentChar);
            }
        }
        System.out.println("Alphabets present in String are: "+ alphabets);
        System.out.println("Digits present in String are: "+ digits);
        System.out.println("Special Characters present in String are: "+ specialCharacters);
    }
}

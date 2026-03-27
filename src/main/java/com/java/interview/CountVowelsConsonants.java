package com.java.interview;

public class CountVowelsConsonants {

    public static void main(String[] args) {

        String str = "Hello World";
        findVowelsConsonants(str);
    }

    private static void findVowelsConsonants(String str) {

        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for(char ch: str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of Vowels "+ vowels);
        System.out.println("Number of Consonants "+ consonants);
    }
}

package com.java.interview;

public class AnagramsApproach2 {

    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";
        System.out.println(isAnagram(str1,str2));
    }

    private static boolean isAnagram(String str1, String str2) {

        int []charCount = new int[256];

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0; i < str1.length();i++){
            System.out.println(charCount[str1.charAt(i)]++);
            charCount[str1.charAt(i)]++;
            System.out.println(charCount[str2.charAt(i)]--);
            charCount[str2.charAt(i)]--;

        }

        for(int count : charCount){
            if( count != 0 ){
                return false;
            }
        }
        return true;

    }
}

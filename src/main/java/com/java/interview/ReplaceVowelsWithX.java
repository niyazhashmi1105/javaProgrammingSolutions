package com.java.interview;

public class ReplaceVowelsWithX {

    public static void main(String[] args) {

        String input ="Name";
        System.out.println(replaceVowelsOnlyWithX(input));
    }

    private static String replaceVowelsOnlyWithX(String str){

        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        char []ch = str.toCharArray();

        for(char currentChar:ch){
            if(currentChar == 'a'|| currentChar =='e' || currentChar =='i'|| currentChar == 'o'|| currentChar == 'u'){
                sb.append('X');
            }
            else{
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}

package com.java.interview;

public class Pangram {

    public static void main(String[] args) {

        String input = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(input);

        if(result){
         System.out.println("It's a pangram");
        }
        else{
            System.out.println("It's not a pangram");
        }
    }

    private static boolean isPangram(String input){
        input = input.toLowerCase();

        if(input.length()<26){
            return false;
        }

        for(char i= 'a';i<='z';i++){
            if(input.indexOf(i)<0){
                return false;
            }
        }
        return true;
    }
}

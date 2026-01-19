package com.java.interview;

public class CountTotalNumberOfCharacters {

    public static void main(String[] args) {

        String input = " Niyaz ";
        int count = 0;

        char [] charArray = input.toCharArray();
        for(int index = 0; index < charArray.length;index++){
            if(charArray[index] == ' '){
                continue;
            }

            boolean whitespaceAfterCharCount = index < charArray.length-1 && charArray[index+1] == ' ';
            boolean whitespaceBeforeCharCount = index > 0 && charArray[index-1] == ' ';
            if(!whitespaceBeforeCharCount && !whitespaceAfterCharCount){
                count++;
            }
        }


        System.out.println("Count is "+ count);
    }
}

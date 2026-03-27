package com.java.interview;

public class CountTotalNumberOfCharacters {

    public static void main(String[] args) {

        String input = " Niyaz is an bad guy";
        int count = 0;

        char [] charArray = input.toCharArray();
        System.out.println(charArray.length);
        boolean whitespaceAfterCharCount;
        boolean whitespaceBeforeCharCount;

        for(int index = 0; index < charArray.length;index++){
            if(charArray[index] == ' '){
                System.out.print(index+" ");
                continue;
            }



            whitespaceAfterCharCount = index < charArray.length-1 && charArray[index+1] == ' ';
            whitespaceBeforeCharCount = index > 0 && charArray[index-1] == ' ';

            if(!whitespaceBeforeCharCount && !whitespaceAfterCharCount){
                count++;
            }
        }
        System.out.println("Count is "+ count);
    }
}

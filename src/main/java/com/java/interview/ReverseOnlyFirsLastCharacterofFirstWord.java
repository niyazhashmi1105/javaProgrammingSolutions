package com.java.interview;

public class ReverseOnlyFirsLastCharacterofFirstWord {

    public static void main(String[] args) {
        String input = "Hello World from Java";
        reverseFirstLastCharacter(input);
    }

    private static void reverseFirstLastCharacter(String input) {

        System.out.println("Original String: "+ input);
        StringBuilder reverseString = new StringBuilder();

        if(input == null || input.isEmpty()){
            System.out.println("Cannot reverse String");
        }
        else{
           String []words = input.split(" ",2);
            System.out.println(words[0]);

           char [] charArray = words[0].toCharArray();
            int left = 0;
            int right = charArray.length-1;
            while(left < right){
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            reverseString.append(charArray);
            System.out.println("Reverse First and Last Character of First Word: "+reverseString+" "+words[1]);
        }
    }
}

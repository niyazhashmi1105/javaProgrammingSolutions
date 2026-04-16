package com.java.interview;

public class SearchString {

    public static void main(String[] args) {

        String input = "I joined ABC 123";
        String searchString = "ABC";
        searchString(input,searchString);
    }

    private static void searchString(String input, String searchTerm) {

        String []words = input.split(" ");
        boolean found = false;
        for(String word: words){
            if(word.equals(searchTerm)){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Input string contains search string");
        }
        else{
            System.out.println("Input string doesn't contains search string");
        }

    }

}

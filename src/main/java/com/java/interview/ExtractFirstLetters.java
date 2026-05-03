package com.java.interview;

public class ExtractFirstLetters {
    public static void main(String[] args) {

        String input = "light- : as+aeather";

        // Split on any sequence of non-alphabetic characters
        String[] tokens = input.split("[^a-zA-Z]+");

        StringBuilder result = new StringBuilder();

        for (String token : tokens) {
            if (!token.isEmpty()) {
                result.append(Character.toUpperCase(token.charAt(0)));
            }
        }

        System.out.println("Output: " + result);
    }
}

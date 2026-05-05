package com.java.interview;

public class MissingChar {
    public static void main(String[] args) {
        String input = "abdf";

        for (int i = 0; i < input.length() - 1; i++) {
            char current = input.charAt(i);
            char next = input.charAt(i + 1);
            if (next - current > 1) {
                for (char ch = (char)(current + 1); ch < next; ch++) {
                    System.out.println("Missing: " + ch);
                }
            }
        }
    }
}

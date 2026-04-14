package com.java.interview;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        String input = "[{()}]";
        System.out.println(checkValidParentheses(input));
    }

    private static boolean checkValidParentheses(String input) {

        char[] ch = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char currentChar : ch) {
            if(currentChar == '('|| currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            else if(currentChar == ')'|| currentChar == '}' || currentChar == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

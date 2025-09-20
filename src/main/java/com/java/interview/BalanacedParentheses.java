package com.java.interview;

import java.util.Stack;

public class BalanacedParentheses {

    public static void main(String[] args) {

        String input = "(())";
        System.out.println(checkValidParenthese(input));
    }

    private static boolean checkValidParenthese(String input) {

        char [] ch = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char currentChar:ch){
            if(currentChar == '('){
                stack.push(currentChar);
            }
            else{
                if(currentChar == ')'){
                    if(stack.isEmpty()){
                        return false;
                    }
                }
                else{
                    char topChar = stack.pop();
                    if(topChar != '('){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

package com.java.interview;

public class SumOfNumbersinAlphanumeric {

    public static void main(String[] args) {

        String str = "12abc34xyz56lmn10";
        System.out.println(getSumOfNumberS(str));
    }

    private static int getSumOfNumberS(String str) {

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        char [] ch = str.toCharArray();

        for(char currentChar: ch){
            if(Character.isDigit(currentChar)){
                sb.append(currentChar);
            }
            else{
                if(!sb.isEmpty()) {
                    sum = sum + Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(!sb.isEmpty()) {
            sum = sum + Integer.parseInt(sb.toString());
        }
        return sum;
    }
}

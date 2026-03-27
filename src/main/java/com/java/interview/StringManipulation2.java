package com.java.interview;

public class StringManipulation2 {

    public static void main(String[] args) {

        String input = "r@56vi ku$%mar67";
        StringBuilder sb = new StringBuilder();
        int sum =0;
        for(char ch: input.toCharArray()){
            if(Character.isLetter(ch)|| ch == ' '){
                sb.append(ch);
            }
            else if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        sb.append(" ");
        sb.append(sum);
        System.out.println(sb);
    }
}

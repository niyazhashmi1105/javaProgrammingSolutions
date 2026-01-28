package com.java.interview;

public class StringCompression {

    public static void main(String[] args) {
        String input = "ddmmmmtta";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for(int index = 1;index< input.length();index++){
            if(input.charAt(index) == input.charAt(index-1)){
                count++;
            }
            else{
                sb.append(input.charAt(index-1));
                sb.append(count);
                count = 1;
            }
        }
        sb.append(input.charAt(input.length()-1));
        sb.append(count);
        System.out.println(sb.toString());
    }
}

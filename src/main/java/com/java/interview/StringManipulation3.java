package com.java.interview;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation3 {

    public static void main(String[] args) {

        String input = "a1b2c3";
        StringBuilder sb = new StringBuilder();
        System.out.println(input);

        List<Character> list = new ArrayList<>();
        for(char ch: input.toCharArray()){
            if(Character.isDigit(ch)){
                list.add(ch);
            }
        }

        System.out.println(list);
        int index = list.size()-1;

        for(char ch:input.toCharArray()){
            if(Character.isDigit(ch)){
                sb.append(list.get(index));
                index--;
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}

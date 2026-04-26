package com.java.interview;

import java.sql.SQLOutput;

public class ChangingKeys {

    public static void main(String[] args) {

        String str = "BaabbabAD";
        System.out.println(getKeysChangeCount(str));
    }

    private static int getKeysChangeCount(String str) {

        char firstKey = str.toCharArray()[0];
        firstKey = Character.toLowerCase(firstKey);

        int count = 0;

        for(int i = 1; i < str.length() ; i++){
            char currentKey = str.toCharArray()[i];
            currentKey = Character.toLowerCase(currentKey);
            if(firstKey != currentKey){
                count++;
            }
            firstKey = currentKey;
        }
        return count;
    }
}

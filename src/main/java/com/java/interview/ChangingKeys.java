package com.java.interview;

public class ChangingKeys {

    public static void main(String[] args) {

        String str = "abBcCD";
        System.out.println(getKeysChangeCount(str));
    }

    private static int getKeysChangeCount(String str) {

        char lastKey = str.toCharArray()[0];
        lastKey = Character.toLowerCase(lastKey);
        int count = 0;

        for(int i = 1; i < str.length() ; i++){
            char currentKey = str.toCharArray()[i];
            currentKey = Character.toLowerCase(currentKey);
            if(lastKey != currentKey){
                count++;
            }
            lastKey = currentKey;
        }
        return count;
    }
}

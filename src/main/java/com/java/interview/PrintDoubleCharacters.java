package com.java.interview;

public class PrintDoubleCharacters {

    public static void main(String[] args) {

        String str = "";
        displayDoubleChars(str);
    }

    private static void displayDoubleChars(String str) {

        StringBuilder sb = new StringBuilder();
        if(str.isEmpty() || str.length() <=0)
        {
            System.out.println("String is empty.Please enter string again");
        }
        for(int  i=0;i<str.length();i++){
            sb.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}

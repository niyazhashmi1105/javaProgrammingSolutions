package com.java.interview;

public class FindPermutationsOfString {

    public static void main(String[] args) {

        String str = "abc";
        findPermutation(str,"");
    }

    private static void findPermutation(String str, String prefix) {
        if(str.isEmpty()){
            System.out.println(prefix);
        }
        else{
            for(int i=0;i<str.length();i++){
                String rem = str.substring(0,i)+str.substring(i+1);
                findPermutation(rem, prefix+str.charAt(i));
            }
        }


    }
}

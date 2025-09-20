package com.java.interview;

public class PrintStarPattern {

    public static void main(String [] args){

        // Pattern 1
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        //Pattern 2
//        int k=1;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=k;j++){
//                System.out.print("*"+" ");
//            }
//            k+=2;
//            System.out.println();
//        }
    }
}

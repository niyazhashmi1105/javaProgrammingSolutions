package com.java.interview;

import java.util.Arrays;

public class MaxProductTripletsSolution1 {

    public static void main(String[] args) {

        int [] a = {-10,-3,5,6,-20 };

        Arrays.sort(a);
        int n = a.length;

        if( n < 3 ){
            System.err.println("Number mt be greater than 3");
            System.exit(0);
        }

        System.out.println(Arrays.toString(a));
        int resultOne = a[n-1]* a[n-2]* a[n-3];
        int resultTwo = a[0]* a[1]* a[n-1];

        int result = Math.max(resultOne,resultTwo);

        System.out.println(result);

    }
}

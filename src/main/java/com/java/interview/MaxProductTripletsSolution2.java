package com.java.interview;

public class MaxProductTripletsSolution2 {

    public static void main(String[] args) {

        int [] a= {-7,-3,2,-5};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int no: a){
            if( no > max1 ) {
                max3 = max2;
                max2 = max1;
                max1 = no;
            }
            else if( no > max2 ){
                max3 = max2;
                max2 = no;
            }
            else if( no > max3 ){
                max3 = no;
            }

            if( no < min1 ){
                min2 = min1;
                min1 = no;
            }
            else if( no < min2 ){
                min2 = no;
            }
        }

        int resultOne = max1 * max2 * max3;
        int resultTwo = min1 * min2 * max1;
        System.out.println("Product of Triplet Numbers: "+"("+max1+","+max2+","+max3+")"+" are"+" "+resultOne);
        System.out.println("Product of Triplet Numbers: "+"("+min1+","+min2+","+max1+")"+" are"+" "+resultTwo);
        System.out.println("Maximum among both numbers "+Math.max(resultOne,resultTwo));

    }
}

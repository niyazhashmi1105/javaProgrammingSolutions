package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeCheck {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20,4, 6, 9, 2, 130, 15, 175);
        boolean containsPrime = list.stream().anyMatch(PrimeCheck::isPrime);
        System.out.println("ArrayList contains prime "+ containsPrime);

        list.stream().filter(PrimeCheck::isPrime).forEach(System.out::println);
    }

    private static boolean isPrime(int num){
        if(num <=1)
            return false;
//        for(int i = 2;i <= Math.sqrt(num); i++){
//            if(num % i == 0)
//                return false;
//        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i->num%i ==0);
       // return true;
    }
}

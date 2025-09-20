package com.java.homework;

import java.util.Scanner;

public class IsOddOrNot {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number to check it is odd or not: ");
            int number = scanner.nextInt();
            if(number % 2 !=0){
                System.out.println("It is an odd number");
            }
            else{
                System.out.println("It is an even number");
            }

        }catch(Exception e){

            System.err.println("Error: Please enter valid number.");
        }
    }
}

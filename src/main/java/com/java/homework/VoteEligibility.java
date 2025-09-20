package com.java.homework;

import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the age to check whether he/she is eligible to vote or not: ");
            int age = scanner.nextInt();
            if(age >=18){
                System.out.println("Eligible to vote");
            }
            else{
                System.out.println("Not Eligible to vote");
            }

        }catch(Exception e){

            System.err.println("Error: Please enter valid age");
        }
    }
}

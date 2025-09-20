package com.java.homework;

import java.util.Scanner;

public class DifferenceOfTwoNumbers {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNum = scanner.nextInt();

            int difference = firstNum - secondNum;

            System.out.printf("First number: %d, Second number: %d%n", firstNum, secondNum);
            System.out.printf("Difference: %d%n", difference);

        } catch (Exception e) {
            System.err.println("Error: Please enter valid integers.");
        }
    }
}

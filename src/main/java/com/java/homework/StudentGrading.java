package com.java.homework;

import java.util.Scanner;

public class StudentGrading {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the Quiz score: ");
            int quizScore = scanner.nextInt();

            System.out.print("Enter the Mid-Term score: ");
            int midTermScore = scanner.nextInt();

            System.out.print("Enter the Final score: ");
            int finalScore = scanner.nextInt();

            int averageScore = (quizScore+midTermScore+finalScore)/3;

            System.out.println("Average: "+ averageScore);

            if(averageScore >= 90){
                System.out.println("Grade A");
            }
            else if(averageScore>=70 && averageScore <90){
                System.out.println("Grade B");
            }

            else if(averageScore >=50 && averageScore <70){
                System.out.println("Grade C");
            }

            else{
                System.out.println("Grade F");
            }


        }catch(Exception e){
            System.err.println("Error: Please enter valid scores.");
        }
    }

}

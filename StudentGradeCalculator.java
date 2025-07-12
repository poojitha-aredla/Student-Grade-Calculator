package com.StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSubjects = 5;
        int[] marks = new int[totalSubjects];
        int total = 0;
        double average;
        char grade;

        System.out.println("Enter marks for " + totalSubjects + " subjects:");

        for (int i = 0; i < totalSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        average = total / (double) totalSubjects;

        // Assign grade
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }

}

package JOBSHEET9;

import java.util.Scanner;

public class arrayAverageScoreXX {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        
        int[] score = new int[numStudents];
        
        double passedTotal = 0;
        double failedTotal = 0;
        int passedCount = 0;
        int failedCount = 0;
        
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                passedTotal += score[i];
                passedCount++;
            } else {
                failedTotal += score[i];
                failedCount++;
            }
        }
        
        double passedAverage = 0;
        if (passedCount > 0) {
            passedAverage = passedTotal / passedCount;
        }

        double failedAverage = 0;
        if (failedCount > 0) {
            failedAverage = failedTotal / failedCount;
        }

        System.out.println("The average score of students who passed is " + passedAverage);
        System.out.println("The average score of students who failed is " + failedAverage);
        
        sc.close();
    }
}

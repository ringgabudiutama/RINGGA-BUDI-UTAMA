package JOBSHEET9;

import java.util.Scanner;

public class studentGrades99 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of student grades to be entered: ");
        int numStudents = sc.nextInt();
        
        int[] grades = new int[numStudents];
        double total = 0;
        int highestGrade = 0;
        int lowestGrade = 101; 

        // Input and Calculate Total
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + "'s grade: ");
            grades[i] = sc.nextInt();
            total += grades[i];
            
            // Determine highest and lowest
            if (grades[i] > highestGrade) {
                highestGrade = grades[i];
            }
            if (grades[i] < lowestGrade) {
                lowestGrade = grades[i];
            }
        }
        
        // Calculate Average
        double averageGrade = total / numStudents;

        System.out.println("\n--- GRADE SUMMARY ---");
        
        // Display all grades
        System.out.print("All grades entered: ");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(grades[i] + (i < numStudents - 1 ? ", " : ""));
        }
        System.out.println();

        System.out.println("Calculated average grade: " + averageGrade);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);
        
        sc.close();
    }
}

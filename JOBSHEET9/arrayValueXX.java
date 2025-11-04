package JOBSHEET9;

import java.util.Scanner;

public class arrayValueXX {

    public static void main(String[] args) {
        
        int[] finalScore = {87, 65, 78, 99, 92, 68, 89, 78, 85, 78};
        
        System.out.println("--- INPUT SCORES ---");
        for (int i = 0; i < finalScore.length; i++) {
            System.out.println("Enter the final score " + i + ": " + finalScore[i]);
        }
        
        System.out.println("\n--- DISPLAY PASS/FAIL STATUS ---");

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Student " + (i + 1) + " "); 

            if (finalScore[i] > 70) {
                System.out.println("Passed!");
            } else {
                System.out.println("Failed!");
            }
        }
    }
}
package JOBSHEET11;

import java.util.Scanner;

public class DescendingSequenceRecursive {

    static void descendingRecursive(int n){
        if (n < 0) return;
        System.out.print(n + " ");
        descendingRecursive(n-1);
    }

    static void descendingIterative(int n){
        for(int i = n; i >= 0; i--){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input.nextInt();

        System.out.println("\nRecursive:");
        descendingRecursive(n);

        System.out.println("\nIterative:");
        descendingIterative(n);
    }
}

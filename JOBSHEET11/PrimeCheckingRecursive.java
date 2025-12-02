package JOBSHEET11;

import java.util.Scanner;

public class PrimeCheckingRecursive {

    static boolean isPrime(int n, int i){
        if(n <= 1)
            return false;
        if(i == 1)
            return true;
        if(n % i == 0)
            return false;
        return isPrime(n, i-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input.nextInt();

        if(isPrime(n, n-1))
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is NOT prime");
    }
}

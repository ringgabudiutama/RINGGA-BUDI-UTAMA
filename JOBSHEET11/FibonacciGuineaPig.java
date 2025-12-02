package JOBSHEET11;

import java.util.Scanner;

public class FibonacciGuineaPig {

    static int fibonacci(int n){
        if(n <= 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input month (1-12): ");
        int month = input.nextInt();

        System.out.println("Guinea pig pairs in month " + month +
                " = " + fibonacci(month));
    }
}

package JOBSHEET11;
import java.util.Scanner;

public class SummationRecursive {


    static int summation(int n){
        if(n == 0)
            return 0;
        return n + summation(n-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input.nextInt();

        System.out.println("Summation result = " + summation(n));
    }
}

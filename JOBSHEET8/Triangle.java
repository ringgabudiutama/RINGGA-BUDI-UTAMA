package JOBSHEET11;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int i = 1; // baris
        while (i <= N) {
            int j = 1; // kolom
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // pindah ke baris berikutnya
            i++;
        }

        sc.close();
    }
}


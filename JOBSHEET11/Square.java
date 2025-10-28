package JOBSHEET11;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        // Outer loop = jumlah baris
        for (int outer = 1; outer <= N; outer++) {
            // Inner loop = jumlah kolom
            for (int inner = 1; inner <= N; inner++) {
                System.out.print("*");
            }
            System.out.println(); // pindah baris setelah 1 baris selesai
        }

        sc.close();
    }
}

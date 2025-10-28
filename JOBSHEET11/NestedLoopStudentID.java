package JOBSHEET11;
import java.util.Scanner;

public class NestedLoopStudentID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] temps = new double[5][7]; // 5 kota, 7 hari

        // --- Input Data Suhu ---
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City #" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("  Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
        }

        System.out.println();

        // --- Menampilkan Data Suhu ---
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City #" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

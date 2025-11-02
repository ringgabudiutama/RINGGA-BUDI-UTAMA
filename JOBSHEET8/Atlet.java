import java.util.Arrays;
import java.util.Scanner;

public class Atlet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Daftar cabang olahraga
        String[] sports = {"Badminton", "Table Tennis", "Basketball", "Volleyball"};

        // Setiap cabang memiliki 5 atlet
        String[][] athletes = new String[sports.length][5];

        // Input data atlet
        for (int i = 0; i < sports.length; i++) {
            System.out.println("\nEnter 5 athletes for " + sports[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Athlete " + (j + 1) + ": ");
                athletes[i][j] = input.nextLine();
            }
        }

        // Tampilkan data urut ascending per cabang
        System.out.println("\n=== Athlete List (Ascending Order) ===");
        for (int i = 0; i < sports.length; i++) {
            Arrays.sort(athletes[i]); // Urutkan nama A-Z
            System.out.println("\n" + sports[i] + ":");
            for (String name : athletes[i]) {
                System.out.println("- " + name);
            }
        }

        input.close();
    }
}


import java.util.Scanner;

public class UjiCoba3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Minimum N value is 3.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Jika di baris atau kolom tepi, cetak angka N
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    // Tengah kosong (spasi)
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}

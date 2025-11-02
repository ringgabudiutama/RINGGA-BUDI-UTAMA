import java.util.Scanner;

public class UjiCoba1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N (minimum 5): ");
        int N = input.nextInt();

        if (N < 5) {
            System.out.println("Minimum N value is 5.");
            return;
        }

        // Cetak segitiga bintang terbalik
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}

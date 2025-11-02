import java.util.Scanner;

public class UjiCoba2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N (minimum 3): ");
        int N = input.nextInt();

        if (N < 3) {
            System.out.println("Minimum N value is 3.");
            return;
        }

        // Cetak segitiga angka
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        input.close();
    }
}


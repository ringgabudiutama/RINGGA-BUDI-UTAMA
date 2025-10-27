import java.util.Scanner;

public class ForMultiplesNoAbsen {
    public static void main(String[] args) {
        // Membuat Scanner untuk input user
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int multiple, sum = 0, counter = 0;

        // Meminta user input
        System.out.print("Input the multiple: ");
        multiple = input.nextInt();

        // Loop untuk menghitung kelipatan
        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;      // Menjumlahkan kelipatan
                counter++;     // Menghitung jumlah kelipatan
            }
        }

        // Menampilkan hasil
        System.out.printf("There are %d number that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d.\n", multiple, sum);
    }
}

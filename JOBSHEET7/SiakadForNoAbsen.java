import java.util.Scanner;

public class SiakadForNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 60;

        // Menambahkan Perulangan untuk 10 mahasiswa
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            // Cek nilai tertinggi
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            // MengeCek nilai terendah
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}

    


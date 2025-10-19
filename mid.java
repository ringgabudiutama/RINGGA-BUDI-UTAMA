import java.util.Scanner;
public class mid1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan Variabel
        String jenisHari;
        int usia;
        double hargaDasar = 0;
        double diskon = 0;
        double biayaTambahan = 0;
        double hargaAkhir = 0;

        // menginput sesuai instruksi
        System.out.println("======= Program Hitung Harga Tiket Cinema By Ringga ======= ");
        System.out.print("jenis hari (weekday/weekend): ");
        jenisHari = input.nextLine();
        System.out.print("usia penonton: ");
        usia = input.nextInt();

        // Pengecekan input valid
        if ((jenisHari.equals("weekday") || jenisHari.equals("weekend")) && usia > 0) {

            // Menentukan harga dasar
            if (jenisHari.equals("weekday")) {
                hargaDasar = 40000;

                if (usia <= 12) {
                    diskon = 0.5 * hargaDasar; // Mendapatkan Diskon 50%
                } else if (usia >= 60) {
                    diskon = 0.3 * hargaDasar; // Mendapatkan Diskon 30%
                }

            } else if (jenisHari.equals("weekend")) {
                hargaDasar = 50000;

                if (usia <= 12) {
                    diskon = 0.3 * hargaDasar; // Mendapatkan Diskon 30%
                } else if (usia >= 60) {
                    diskon = 0.1 * hargaDasar; // Mendapatkan Diskon 10%
                } else if (usia >= 18 && usia <= 25) {
                    biayaTambahan = 0.05 * hargaDasar; // Mendapatkan Tambahan 5%
                }
            }

            // Menghitung harga akhir
            hargaAkhir = hargaDasar - diskon + biayaTambahan;

            // Menampilkan hasil
            System.out.println();
            System.out.println("Harga dasar: Rp " + hargaDasar);
            if (diskon > 0) {
                System.out.println("Diskon: Rp " + diskon);
            }
            if (biayaTambahan > 0) {
                System.out.println("Biaya tambahan: Rp " + biayaTambahan);
            }
            System.out.println("Harga akhir tiket: Rp " + hargaAkhir);

        } else {
            System.out.println("Input tidak valid! Silakan periksa kembali masukan Anda.");
        }
    }
}

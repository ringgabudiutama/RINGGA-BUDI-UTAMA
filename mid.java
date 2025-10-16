import java.util.Scanner;

public class mid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaDasar, diskonUsia, diskonHari, biayaTambahan, hargaAkhir;
        String jenisHari;
        int usia;

        // 1. Input dari pengguna
        System.out.println("--- Perhitungan Harga Tiket Bioskop ---");
        System.out.print("Masukkan Jenis Hari (Kerja / Pekan): ");
        jenisHari = scanner.nextLine();

        System.out.print("Masukkan Usia (Tahun): ");
        usia = scanner.nextInt();

        // 2. Menentukan Harga Dasar
        if (jenisHari.equalsIgnoreCase("Kerja")) {
            hargaDasar = 40000;
        } else if (jenisHari.equalsIgnoreCase("Pekan")) {
            hargaDasar = 50000;
        } else {
            System.out.println("Jenis Hari tidak valid. Menggunakan Harga Dasar Hari Kerja (Rp 40.000).");
            hargaDasar = 40000;
        }

        // 3. Menghitung Diskon Usia
        if (usia <= 12) {
            diskonUsia = 0.30 * hargaDasar;
        } else if (usia >= 60) {
            diskonUsia = 0.20 * hargaDasar;
        } else {
            diskonUsia = 0;
        }

        // 4. Menghitung Harga Setelah Diskon Usia
        double hargaSetelahDiskonUsia = hargaDasar - diskonUsia;

        // 5. Menghitung Diskon Hari dan Biaya Tambahan
        diskonHari = 0;
        biayaTambahan = 0;

        if (jenisHari.equalsIgnoreCase"Kerja")) {
            // Hari Kerja: Diskon 10% untuk semua usia
            diskonHari = 0.10 * hargaSetelahDiskonUsia; // menerapkan ke harga setelah diskon usia
        } else if (jenisHari.equalsIgnoreCase("Pekan")) {
            // Akhir Pekan: Biaya Tambahan 5% (maks Rp 3.000) untuk usia 13-59
            if (usia >= 13 && usia <= 59) {
                // Biaya tambahan dihitung dari harga normal (hargaDasar)
                double hitunganTambahan = 0.05 * hargaDasar;
                // Batasan maksimum Rp 3.000
                biayaTambahan = Math.min(hitunganTambahan, 3000);
            }
        }

        // 6. Menghitung Harga Akhir
        hargaAkhir = hargaSetelahDiskonUsia - diskonHari + biayaTambahan;

        // 7. Menampilkan Output Hasil
        System.out.println("\n--- Detail Perhitungan ---");
        System.out.println("Harga Dasar: Rp " + String.format("%,.0f", hargaDasar));
        System.out.println("Diskon Usia (" + usia + " tahun): Rp " + String.format("%,.0f", diskonUsia));
        System.out.println("Harga Setelah Diskon Usia: Rp " + String.format("%,.0f", hargaSetelahDiskonUsia));
        System.out.println("Diskon Hari (" + jenisHari + "): Rp " + String.format("%,.0f", diskonHari));
        System.out.println("Biaya Tambahan: Rp " + String.format("%,.0f", biayaTambahan));
        System.out.println("------------------------------------");
        System.out.println("Harga Akhir Tiket: Rp " + String.format("%,.0f", hargaAkhir));

        scanner.close();
    }
}
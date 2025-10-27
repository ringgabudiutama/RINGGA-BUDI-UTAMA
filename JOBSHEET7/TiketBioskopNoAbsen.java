import java.util.Scanner;

public class TiketBioskopNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTiket;
        double totalHarga, diskon;
        final double hargaTiket = 50000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Program dihentikan.");
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Silakan masukkan jumlah tiket yang benar.\n");
                sc.nextLine(); 
                continue;
            }

            // Menghitung total harga & diskon
            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            totalHarga -= totalHarga * diskon;

            System.out.println("Total yang harus dibayar oleh " + namaPelanggan + ": Rp " + totalHarga + "\n");
            sc.nextLine(); 

        } while (true);

        System.out.println("Semua transaksi selesai.");
      
    }
}

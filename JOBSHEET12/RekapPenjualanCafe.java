package JOBSHEET12;

import java.util.Scanner;

public class RekapPenjualanCafe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int menu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int hari = sc.nextInt();

        String[] namaMenu = new String[menu];
        int[][] penjualan = new int[menu][hari];

        sc.nextLine(); // buang enter

        for (int i = 0; i < menu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
            namaMenu[i] = sc.nextLine();

            System.out.println("Masukkan penjualan " + namaMenu[i] + " selama " + hari + " hari:");
            for (int j = 0; j < hari; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        // Tampilkan semua data
        System.out.println("\n=== DATA PENJUALAN ===");
        for (int i = 0; i < menu; i++) {
            System.out.print(namaMenu[i] + ": ");
            for (int j = 0; j < hari; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }

        // Penjualan tertinggi
        int max = 0;
        String menuTertinggi = "";
        int hariKe = 0;

        for (int i = 0; i < menu; i++) {
            for (int j = 0; j < hari; j++) {
                if (penjualan[i][j] > max) {
                    max = penjualan[i][j];
                    menuTertinggi = namaMenu[i];
                    hariKe = j + 1;
                }
            }
        }

        System.out.println("\nPenjualan tertinggi: "
                + menuTertinggi + " (" + max + ") pada hari ke-" + hariKe);

        // Rata-rata
        System.out.println("\n=== RATA-RATA PENJUALAN ===");
        for (int i = 0; i < menu; i++) {
            int total = 0;
            for (int j = 0; j < hari; j++) {
                total += penjualan[i][j];
            }

            double rata = (double) total / hari;
            System.out.println(namaMenu[i] + ": " + rata);
        }

        sc.close();
    }
}

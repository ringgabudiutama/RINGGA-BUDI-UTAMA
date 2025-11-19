package Random;
import java.util.Scanner;

public class Ringga123 {
    public static void main(String[] args) {
        Scanner radit = new Scanner(System.in);
        radit.close();

        int rekapPenjualan22[][] = {
                { 2, 3, 4, 5 },
                { 3, 3, 3, 2 },
                { 4, 4, 5, 5 },
                { 1, 3, 3, 8 },
                { 2, 2, 2, 2 }
        };

        String bulan[] = { "jan", "Feb", "Maret", "April" };
        String namaKaryawan22[] = { "Sito", "Semi", "Risma", "Vero", "Barri" };
        double totalPenjualan22[] = new double[4];
        double rekapPenjualan22_2[][] = new double[5][4];

        for (int i22 = 0; i22 < rekapPenjualan22.length; i22++) {
            for (int j22 = 0; j22 < rekapPenjualan22[i22].length; j22++) {
                rekapPenjualan22_2[i22][j22] = rekapPenjualan22[i22][j22] * 1_000_000;
            }
        }

        for (int i22 = 0; i22 < rekapPenjualan22_2.length; i22++) {
            rekapPenjualan22_2[i22][1] = rekapPenjualan22_2[i22][1] - (rekapPenjualan22_2[i22][1] * 0.22);
        }

        for (int j22 = 0; j22 < rekapPenjualan22_2[0].length; j22++) {
            for (int i22 = 0; i22 < rekapPenjualan22_2.length; i22++) {
                totalPenjualan22[j22] += rekapPenjualan22_2[i22][j22];
            }
        }

        System.out.printf("%7s %20s %20s %22s %20s", " ", "Jan", "Feb", "Maret", "April\n");
        for (int i22 = 0; i22 < rekapPenjualan22_2.length; i22++) {
            System.out.printf("%10s %20.0f %20.0f %20.0f %20.0f\n", namaKaryawan22[i22], rekapPenjualan22_2[i22][0],
                    rekapPenjualan22_2[i22][1], rekapPenjualan22_2[i22][2], rekapPenjualan22_2[i22][3]);
        }

        System.out.println();
        for (int i22 = 0; i22 < totalPenjualan22.length; i22++) {

            System.out.printf("%-7s:  %-50.0f \n", bulan[i22], totalPenjualan22[i22]);
        }
    }
}

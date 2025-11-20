package UAS.UAS;

import java.util.Scanner;
// Mulai dari sini ( start )
public class UasRingga {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah daerah: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Saya Menginput dengan membuat Array dengan memasukkan nama daerah, infrastruktur, kesehatan, dan pendidikan
        String[] nama = new String[n];
        double[] infra = new double[n];
        double[] kes = new double[n];
        double[] pend = new double[n];

        // Saya Menginput Data Survey
        for (int i = 0; i < n; i++) {
            System.out.println("\nDaerah ke-" + (i+1));

            System.out.print("Nama daerah: ");
            nama[i] = sc.nextLine();

            System.out.print("Nilai Infrastruktur: ");
            infra[i] = sc.nextDouble();

            System.out.print("Nilai Kesehatan: ");
            kes[i] = sc.nextDouble();

            System.out.print("Nilai Pendidikan: ");
            pend[i] = sc.nextDouble();

            sc.nextLine();
        }

        // Saya Menampilkan Hasil Data Survey
        System.out.println("\n=== HASIL SURVEY ===");
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i] + " | "
                    + infra[i] + " | "
                    + kes[i] + " | "
                    + pend[i]);
        }

        // Saya Menghitung Rata Rata Infra, Kes, dan pend
        double totalInfra = 0, totalKes = 0, totalPend = 0;

        for (int i = 0; i < n; i++) {
            totalInfra += infra[i];
            totalKes += kes[i];
            totalPend += pend[i];
        }

        System.out.println("\n=== RATA-RATA ===");
        System.out.println("Infrastruktur = " + (totalInfra / n));
        System.out.println("Kesehatan    = " + (totalKes / n));
        System.out.println("Pendidikan   = " + (totalPend / n));

        // Saya Mencari yang terbaik per daerah 
        int maxInfra = 0, maxKes = 0, maxPend = 0;

        for (int i = 1; i < n; i++) {
            if (infra[i] > infra[maxInfra]) maxInfra = i;
            if (kes[i] > kes[maxKes]) maxKes = i;
            if (pend[i] > pend[maxPend]) maxPend = i;
        }

        System.out.println("\n=== DAERAH NILAI TERBAIK ===");
        System.out.println("Infrastruktur : " + nama[maxInfra]);
        System.out.println("Kesehatan    : " + nama[maxKes]);
        System.out.println("Pendidikan   : " + nama[maxPend]);

        // Saya Memprogram Daerah yang terbaik 
        System.out.println("\n=== PROGRAM TERFAVORIT DI SETIAP DAERAH ===");
        for (int i = 0; i < n; i++) {
            String fav = "Infrastruktur";
            double max = infra[i];

            if (kes[i] > max) {
                max = kes[i];
                fav = "Kesehatan";
            }

            if (pend[i] > max) {
                fav = "Pendidikan";
            }

            System.out.println("Daerah " + nama[i] + " favorit: " + fav);
        }
    }
}

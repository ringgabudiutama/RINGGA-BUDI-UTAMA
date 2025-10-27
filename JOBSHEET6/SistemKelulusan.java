import java.util.Scanner;

public class SistemKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        System.out.println("\n--- Algoritma dan Pemrograman ---");
        System.out.print("UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Tugas : ");
        double tugas1 = sc.nextDouble();

        System.out.println("\n--- Struktur Data ---");
        System.out.print("UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Tugas : ");
        double tugas2 = sc.nextDouble();

        double akhir1 = uts1 * 0.3 + uas1 * 0.4 + tugas1 * 0.3;
        double akhir2 = uts2 * 0.3 + uas2 * 0.4 + tugas2 * 0.3;
        double rata = (akhir1 + akhir2) / 2;

        String status1 = (akhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String status2 = (akhir2 >= 60) ? "LULUS" : "TIDAK LULUS";

        String huruf1, huruf2;
        huruf1 = konversiHuruf(akhir1);
        huruf2 = konversiHuruf(akhir2);

        String statusSemester;
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rata >= 70)
                statusSemester = "LULUS (Rata-rata ≥ 70)";
            else
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        } else {
            statusSemester = "TIDAK LULUS (Salah satu MK tidak lulus)";
        }

        System.out.println("\n================ HASIL PENILAIAN AKADEMIK ================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println();
        System.out.printf("%-20s %-5s %-5s %-7s %-12s %-10s %-10s\n",
                "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-20s %-5.0f %-5.0f %-7.0f %-12.2f %-10s %-10s\n",
                "Algoritma Pemrograman", uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("%-20s %-5.0f %-5.0f %-7.0f %-12.2f %-10s %-10s\n",
                "Struktur Data", uts2, uas2, tugas2, akhir2, huruf2, status2);
        System.out.println();
        System.out.printf("Rata-rata Nilai Akhir : %.2f\n", rata);
        System.out.println("Status Semester       : " + statusSemester);

        sc.close();
    }

    public static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 80) return "A-";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 55) return "D";
        else return "E";
    }
}

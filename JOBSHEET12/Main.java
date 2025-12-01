package JOBSHEET12;
import java.util.Scanner;

class NilaiMahasiswaNoAbsen {

    public int[] isianArray(int N, Scanner sc) {
        int[] nilaiMahasiswa = new int[N];
        for (int i = 0; i < N; i++) {
            nilaiMahasiswa[i] = sc.nextInt();
        }
        return nilaiMahasiswa;
    }

    public void tampilArray(int[] nilaiMahasiswa) {
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    public double hitTot(int[] nilaiMahasiswa) {
        double total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiMahasiswaNoAbsen nilaiMhs = new NilaiMahasiswaNoAbsen();

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = sc.nextInt();

        System.out.println("Masukkan " + N + " nilai mahasiswa:");
        int[] arrayNilai = nilaiMhs.isianArray(N, sc);

        System.out.print("Nilai yang diinputkan: ");
        nilaiMhs.tampilArray(arrayNilai);

        double totalNilai = nilaiMhs.hitTot(arrayNilai);
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}

import java.util.Scanner;

/*
Nama : Ringga Budi Utama
Kelas : 1I
Major : Informatics Engginering 
*/

public class Scholarship {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan data pendaftar
        String[] name = new String[100];
        String[] nim = new String[100];
        String[] type = new String[100];
        double[] gpa = new double[100];
        double[] income = new double[100];

        int count = 0; // menghitung berapa data yang sudah disimpan
        int menu;     // menyimpan menu yang dipilih

        // Perulangan menu agar program terus berjalan
        do {
            System.out.println("\n===== Scholarship Registration System =====");
            System.out.println("1. Tambah Pendaftar");
            System.out.println("2. Tampilkan Semua Data Pendaftar");
            System.out.println("3. Cari Berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-Rata GPA berdasarkan Jenis");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = input.nextInt();
            input.nextLine(); // membersihkan enter

            // ===== MENU 1: INPUT DATA =====
            if (menu == 1) {
                System.out.println("\n--- Input Data Pendaftar ---");

                System.out.print("Nama: ");
                name[count] = input.nextLine();

                System.out.print("NIM: ");
                nim[count] = input.nextLine();

                System.out.print("GPA (IPK): ");
                gpa[count] = input.nextDouble();
                input.nextLine();

                System.out.print("Jenis Beasiswa (Regular / Outstanding / Research): ");
                type[count] = input.nextLine();

                // Validasi jenis beasiswa
                if (!type[count].equalsIgnoreCase("Regular") &&
                    !type[count].equalsIgnoreCase("Outstanding") &&
                    !type[count].equalsIgnoreCase("Research")) {
                    System.out.println("Jenis beasiswa tidak valid! Data ditolak.");
                    continue; // kembali ke menu tanpa tambah data
                }

                System.out.print("Pendapatan Orang Tua (maks 2000000): ");
                income[count] = input.nextDouble();
                input.nextLine();

                // Validasi pendapatan
                if (income[count] > 2000000) {
                    System.out.println("Ditolak! Pendapatan orang tua melebihi batas.");
                    continue;
                }

                System.out.println("Data berhasil disimpan!");
                count++; // menambah jumlah data yang tersimpan
            }

            // ===== MENU 2: MENAMPILKAN SEMUA DATA =====
            else if (menu == 2) {
                System.out.println("\n--- Daftar Semua Pendaftar ---");

                if (count == 0) {
                    System.out.println("Belum ada data!");
                } else {
                    // menampilkan semua data sesuai jumlah count
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1)+". "+name[i]+" | "+nim[i]+" | GPA: "+gpa[i]+" | "+type[i]+" | Income: "+income[i]);
                    }
                }
            }

            // ===== MENU 3: MENCARI BERDASARKAN BEASISWA =====
            else if (menu == 3) {
                System.out.print("\nMasukkan Jenis Beasiswa untuk Dicari: ");
                String search = input.nextLine();
                boolean found = false; // penanda jika data ditemukan

                for (int i = 0; i < count; i++) {
                    if (type[i].equalsIgnoreCase(search)) {
                        System.out.println(name[i]+" - "+nim[i]+" - GPA: "+gpa[i]);
                        found = true;
                    }
                }

                if (!found) System.out.println("Tidak ada pendaftar dengan jenis beasiswa tersebut!");
            }

            // ===== MENU 4: MENGHITUNG RATA-RATA GPA =====
            else if (menu == 4) {
                System.out.print("\nMasukkan Jenis Beasiswa: ");
                String search = input.nextLine();

                double total = 0; // menampung total GPA
                int jml = 0;      // menampung jumlah data yang cocok

                // proses menjumlahkan GPA
                for (int i = 0; i < count; i++) {
                    if (type[i].equalsIgnoreCase(search)) {
                        total += gpa[i];
                        jml++;
                    }
                }

                // jika tidak ada data
                if (jml == 0) System.out.println("Tidak ada data untuk dihitung!");
                else System.out.println("Rata-rata GPA untuk "+search+" = " + (total / jml));
            }

        } while (menu != 5); // program berhenti jika menu = 5

        System.out.println("\nTerima kasih! Program selesai.");
    }
}

import java.util.Scanner;

/*
Nama  : Ringga Budi Utama
Kelas : 1I
Prodi : Informatics Engineering

Program : Sistem Pendaftaran Beasiswa
Catatan :
- Beasiswa diterima jika penghasilan orang tua <= 2.000.000
- IPK hanya digunakan untuk laporan dan perhitungan rata-rata
*/

public class Scholarship {

    static Scanner input = new Scanner(System.in);

    /*
    Array 2 Dimensi
    Baris  : data mahasiswa
    Kolom  :
    0 = Nama
    1 = NIM
    2 = IPK
    3 = Jenis Beasiswa
    4 = Penghasilan Orang Tua
    */
    static String[][] data = new String[100][5];

    // Menyimpan jumlah pendaftar
    static int jumlah = 0;

    public static void main(String[] args) {
        int menu;

        do {
            tampilMenu();
            menu = input.nextInt();
            input.nextLine(); // bersihkan enter

            if (menu == 1) {
                tambahData();
            } 
            else if (menu == 2) {
                tampilSemua();
            } 
            else if (menu == 3) {
                cariBeasiswa();
            } 
            else if (menu == 4) {
                hitungRataIPK();
            }

        } while (menu != 5);

        System.out.println("Terima kasih, program selesai.");
    }

    // ================= MENU UTAMA =================
    static void tampilMenu() {
        System.out.println("\n=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    // ================= MENU 1 =================
    static void tambahData() {

        System.out.print("Nama Mahasiswa: ");
        data[jumlah][0] = input.nextLine();

        System.out.print("NIM: ");
        data[jumlah][1] = input.nextLine();

        System.out.print("IPK Terakhir: ");
        data[jumlah][2] = input.nextLine();

        System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
        data[jumlah][3] = input.nextLine();

        if (!data[jumlah][3].equalsIgnoreCase("Reguler") &&
            !data[jumlah][3].equalsIgnoreCase("Unggulan") &&
            !data[jumlah][3].equalsIgnoreCase("Riset")) {
            System.out.println("Jenis beasiswa tidak valid!");
            return;
        }

        System.out.print("Penghasilan Orang Tua (maksimal 2000000): ");
        double income = input.nextDouble();
        input.nextLine();

        if (income > 2000000) {
            System.out.println("Pendaftaran ditolak karena penghasilan melebihi batas.");
            return;
        }

        data[jumlah][4] = String.valueOf(income);
        jumlah++;

        System.out.println("Pendaftar berhasil disimpan. Total pendaftar: " + jumlah);
    }

    // ================= MENU 2 =================
    static void tampilSemua() {

        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPendaftar ke-" + (i + 1));
            System.out.println("Nama Mahasiswa : " + data[i][0]);
            System.out.println("NIM            : " + data[i][1]);
            System.out.println("IPK Terakhir   : " + data[i][2]);
            System.out.println("Jenis Beasiswa : " + data[i][3]);
            System.out.println("Penghasilan    : " + data[i][4]);
        }
    }

    // ================= MENU 3 =================
    static void cariBeasiswa() {

        System.out.print("Masukkan Jenis Beasiswa: ");
        String cari = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < jumlah; i++) {
            if (data[i][3].equalsIgnoreCase(cari)) {
                System.out.println(
                    data[i][0] + " | NIM: " + data[i][1] + " | IPK: " + data[i][2]
                );
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada pendaftar dengan jenis beasiswa tersebut.");
        }
    }

    // ================= MENU 4 =================
    static void hitungRataIPK() {

        String[] jenis = {"Reguler", "Unggulan", "Riset"};

        for (int j = 0; j < jenis.length; j++) {

            double totalIPK = 0;
            int jumlahData = 0;

            for (int i = 0; i < jumlah; i++) {
                if (data[i][3].equalsIgnoreCase(jenis[j])) {
                    totalIPK += Double.parseDouble(data[i][2]);
                    jumlahData++;
                }
            }

            if (jumlahData > 0) {
                double rata = totalIPK / jumlahData;
                System.out.println(jenis[j] + " : rata-rata IPK = " + rata);
            } else {
                System.out.println(jenis[j] + " : tidak ada pendaftar.");
            }
        }
    }

    // ================= TAMBAHAN =================
    static void hitungRataPenghasilan() {

        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        double totalPenghasilan = 0;

        for (int i = 0; i < jumlah; i++) {
            totalPenghasilan += Double.parseDouble(data[i][4]);
        }

        double rataRata = totalPenghasilan / jumlah;
        System.out.println("Rata-rata penghasilan orang tua: " + rataRata);
    }
}

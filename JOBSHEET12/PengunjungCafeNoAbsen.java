package JOBSHEET12;

public class PengunjungCafeNoAbsen {

    // fungsi varargs
    static void daftarPengunjung(String... namaPengunjung) {

        System.out.println("Daftar Nama Pengunjung:");

        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }

    public static void main(String[] args) {

        daftarPengunjung("Ali", "Budi", "Citra");
        System.out.println();

        daftarPengunjung("Andi");
        System.out.println();

        daftarPengunjung("Doni", "Bti", "Fahmi", "Galih");
    }
}

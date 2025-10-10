import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        
        boolean uktLunas = sc.nextBoolean();

        // **********************************************
        // TAMBAHAN UNTUK TUGAS 1 (Ternary Operator)
        // **********************************************
        
        // 1. Ternary Operator untuk status verifikasi:
        String statusVerifikasi = uktLunas ? "Pembayaran UKT terverifikasi" : "Pembayaran UKT Belum Terverifikasi";
        
        // 2. Ternary Operator untuk pesan tindakan/KRS:
        String pesanKRS = uktLunas ? "Silahkan cetak KRS dan minta tanda tangan DPA" : "KRS belum bisa dicetak! Silahkan lunasi UKT Anda.";

        // Mencetak hasil Ternary Operator
        System.out.println(statusVerifikasi);
        System.out.println(pesanKRS);
        
        // **********************************************
        // Kode IF/Else Asli (Opsional: bisa dihapus atau dikomentari)
        // **********************************************

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     // Jika ingin menambahkan else ke kode asli:
        //     System.out.println("Pembayaran UKT Belum Terverifikasi");
        //     System.out.println("KRS belum bisa dicetak!");
        // }
        
        sc.close();
    }
}
        
    


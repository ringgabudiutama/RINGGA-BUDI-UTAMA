import java.util.Scanner;

public class AksesWifiKampus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisPengguna;
        int jumlahSKS = 0; 

        System.out.println("--- Sistem Verifikasi Akses Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        jenisPengguna = sc.nextLine().toLowerCase(); 

        if (jenisPengguna.equals("dosen")) {
            System.out.println("\nStatus Akses: Dosen");
            System.out.println("Selamat! Akses WiFi diberikan.");

        } else if (jenisPengguna.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            jumlahSKS = sc.nextInt();
            
            if (jumlahSKS >= 12) {
                System.out.println("\nStatus Akses: Mahasiswa Aktif");
                System.out.println("Selamat! Akses diberikan (SKS terpenuhi).");

            } else {
                System.out.println("\nStatus Akses: Mahasiswa Tidak Aktif (SKS Kurang)");
                System.out.println("Akses ditolak (Jumlah SKS kurang dari 12).");
            }
        
        } else {
            System.out.print("Anda bukan Dosen atau Mahasiswa. Masukkan jumlah SKS (Diabaikan untuk akses): ");
            jumlahSKS = sc.nextInt(); 
            System.out.println("\nStatus Akses: Pengguna Lain");
            System.out.println("Akses ditolak (Bukan Dosen atau Mahasiswa).");
        }
    }
}


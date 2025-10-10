import java.util.Scanner;

public class nestedUjianSkripsiNolPersensi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String pesan;
        // Input data mahasiswa
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) ");
        String bebasKompen = scanner.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = scanner.nextInt();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = scanner.nextInt();

         if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan="Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan="Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan="Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan="Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan="Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}


                
        
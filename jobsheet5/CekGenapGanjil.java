import java.util.Scanner;

public class CekGenapGanjil {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);

      
        System.out.println("--- Program Cek Angka Genap atau Ganjil ---");
        System.out.print("Masukkan sebuah angka: ");
        angka = input.nextInt();

       
        if (angka % 2 == 0) {
            // Jalur "Ya" (True)
            // [output "Genap"]
            System.out.println("Output: Genap");
        } else {
            // Jalur "Tidak" (False)
            // [output "Ganjil"]
            System.out.println("Output: Ganjil");
        }

        input.close();
    }
}
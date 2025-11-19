package Random;

public class Kuis21Fauzi {
    public static void main(String[] args) {
        String[] menu = {"Italian Food", "Korean Food", "Chinese Food", "Khas Jogja", "Khas Madura"};
        int[][] menuLayanan = {
            {6, 8, 4},      // italian food
            {10, 16, 11},   // korean food
            {9, 14, 10},    // chinese food
            {12, 5, 7},     // khas jogja
            {5, 8, 5}       // khas madura
        };
        int[] totalPerMenu = new int[menuLayanan.length];
        int hargaMakananLuarNegeri = 50_000;
        int hargaMakananDalamNegeri = 35_000;
        double totalPemasukan = 0;
        int totalMenuTerlaris = 0;
        int totalMenuTidakLaku = 100;
        String menuTerlaris = "", menuTidakLaris = "";
        
        // 21 % 5 = 1
        int indexKoreanFood = 1;
        double rataRataKoreanFood = 0;

        System.out.println("=== Total Setiap Makanan yang Terjual ===");
        // hitung total permenu
        for (int i = 0; i < menuLayanan.length; i++) {
            for (int j = 0; j < menuLayanan[j].length; j++) {
                totalPerMenu[i] += menuLayanan[i][j];
            }
        }
        
        // output permenu
        for (int i = 0; i < totalPerMenu.length; i++) {
            System.out.print(menu[i] + "\t: ");
            System.out.print(totalPerMenu[i]);

            System.out.println();
        }

        System.out.println();

        // hitung rata rata korean food
        rataRataKoreanFood = (double) totalPerMenu[indexKoreanFood] / 3;
        //output rata rata korean food
        System.out.println("Rata-rata pembelian " + menu[indexKoreanFood] + ": " + rataRataKoreanFood);

        System.out.println();

        // hitung pemasukan
        for (int i = 0; i < totalPerMenu.length; i++) {
            if(i < 3){ // makanan luar negeri
                totalPemasukan += totalPerMenu[i] * hargaMakananLuarNegeri;
            }else{ // makanan dalam negeri
                totalPemasukan += totalPerMenu[i] * hargaMakananDalamNegeri;
            }
        }

        // output total pemasukan
        System.out.println("Total pemasukan dalam satu hari: Rp." + totalPemasukan);

        System.out.println();

        // proses cari menu terlaris dan tidak laku
        int takeout = 5 % 3;
        for (int i = 0; i < menuLayanan.length; i++) {
            if(menuLayanan[i][takeout] > totalMenuTerlaris){
                totalMenuTerlaris = menuLayanan[i][takeout];
                menuTerlaris = menu[i];
            }

            if(menuLayanan[i][takeout] < totalMenuTidakLaku){
                totalMenuTidakLaku = menuLayanan[i][takeout];
                menuTidakLaris = menu[i];
            }
        }

        //output makanan terlaris dan tidak laku
        System.out.println("Makanan terlaris: " + menuTerlaris);
        System.out.println("Makanan tidak laris: " + menuTidakLaris);
    }
}

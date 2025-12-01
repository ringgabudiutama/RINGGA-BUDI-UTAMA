package JOBSHEET12;

public class KubusNoAbsen {

    // fungsi (basic saja)
    static int hitungVolume(int sisi){
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaan(int sisi){
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {

        int sisi = 7;

        int volume = hitungVolume(sisi);
        int luas = hitungLuasPermukaan(sisi);

        System.out.println("Sisi Kubus: " + sisi);
        System.out.println("Volume: " + volume);
        System.out.println("Luas Permukaan: " + luas);
    }
}

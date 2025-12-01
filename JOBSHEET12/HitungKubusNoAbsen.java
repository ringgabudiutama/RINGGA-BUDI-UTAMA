package JOBSHEET12;


    public static int hitungVolume(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        int p, l, t, volume;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        l = input.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        volume = hitungVolume(p, l, t);

        System.out.println("Volume kubus adalah = " + volume);
    }
}

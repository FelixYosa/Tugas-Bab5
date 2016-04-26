package tugas1;

import java.util.Scanner;

public class MainKalkulator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih, banyak;
        int bil[];
        Kalkulator kalkulator = new Kalkulator();

        do {
            System.out.println("===KALKULATOR FELIX===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = in.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Banyak bilangan : ");
                    banyak = in.nextInt();
                    bil = new int[banyak + 1];
                    for (int i = 1; i <= banyak; i++) {
                        System.out.print("Masukkan bilangan ke-" + i + " : ");
                        bil[i] = in.nextInt();
                    }
                    Kalkulator.penjumlahan(bil);
                    break;

                case 2:
                    System.out.print("Banyak bilangan : ");
                    banyak = in.nextInt();
                    bil = new int[banyak + 1];
                    for (int i = 1; i <= banyak; i++) {
                        System.out.print("Masukkan bilangan ke-" + i + " : ");
                        bil[i] = in.nextInt();
                    }
                    Kalkulator.pengurangan(bil);
                    break;

                case 3:
                    System.out.print("Banyak bilangan : ");
                    banyak = in.nextInt();
                    bil = new int[banyak + 1];
                    for (int i = 1; i <= banyak; i++) {
                        System.out.print("Masukkan bilangan ke-" + i + " : ");
                        bil[i] = in.nextInt();
                    }
                    kalkulator.perkalian(bil);
                    break;

                case 4:
                    System.out.print("Banyak bilangan : ");
                    banyak = in.nextInt();
                    bil = new int[banyak + 1];
                    for (int i = 1; i <= banyak; i++) {
                        System.out.print("Masukkan bilangan ke-" + i + " : ");
                        bil[i] = in.nextInt();
                    }
                    kalkulator.pembagian(bil);
                    break;

                case 5:
                    System.out.print("Masukkan pembilang: ");
                    int bil1 = in.nextInt();
                    System.out.print("Masukkan penyebut: ");
                    int bil2 = in.nextInt();
                    kalkulator.sederhana(bil1, bil2);
                    break;
            }
        } while (pilih != 0);
    }

}


package tugas1;

import java.util.Scanner;

public class MainKalkulator{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("===KALKULATOR FELIX===");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = in.nextInt();
            
            
        }while(pilih != 0);
    }
    
}

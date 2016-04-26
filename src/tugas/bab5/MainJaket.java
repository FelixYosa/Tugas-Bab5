//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugas2;

import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("=========CV.LABKOMDAS=========");
        System.out.println("===INDUSTRI PEMBUATAN JAKET===");
        System.out.println("1. Bahan A  Rp. 100.000,00");
        System.out.println("2. Bahan B  Rp. 125.000,00");
        System.out.println("3. Bahan C  Rp. 175.000,00");
        System.out.println("Diskon jika pembelian lebih dari 100");
        System.out.println("");
        System.out.print("Masukkan bahan(1/2/3) : ");
        int bahan = in.nextInt();
        System.out.print("Masukkan jumlah(1-100) : ");
        int jum = in.nextInt();
        if(bahan < 1 || bahan > 3){
            System.out.println("Maaf pilihan bahan anda tidak ada");
        }
        else if(jum < 1){
            System.out.println("Maaf inputan jumlah anda salah");
        }
        else {
            Jaket jaket = new Jaket();
            jaket.setTotal(bahan, jum);
            System.out.print("Total harga : "+jaket.getTotal());
        }
    }
    
}

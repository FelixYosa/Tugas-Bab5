//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugas1;

public class Kalkulator {

    public static void penjumlahan(int a[]) {
        int jum = 0;
        for (int i = 1; i < a.length; i++) {
            jum = jum + a[i];
        }
        System.out.println("Hasil penjumlahan : " + jum);
    }

    public static void pengurangan(int a[]) {
        int kurang = 0;
        for (int i = 1; i < a.length; i++) {
            if (i == 1) {
                kurang = kurang + a[i];
            } else {
                kurang = kurang - a[i];
            }
        }
        System.out.println("Hasil pengurangan : " + kurang);
    }

    public void perkalian(int a[]) {
        double kali = 1;
        for (int i = 1; i < a.length; i++) {
            kali = kali * a[i];
        }
        System.out.println("Hasil perkalian : " + kali);
    }

    public void pembagian(int a[]) {
        double bagi = 0;
        for (int i = 1; i < a.length; i++) {
            if (i == 1) {
                bagi = bagi + a[i];
            } else {
                bagi = bagi / a[i];
            }
        }
        System.out.println("Hasil pembagian : " + bagi);
    }

    public void sederhana(int a, int b) {
        double desimal = a / b;
        System.out.println("Hasil penyederhanaan : " + desimal);
    }
}

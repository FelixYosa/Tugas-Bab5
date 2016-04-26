package tugas1;

public class Kalkulator{
    
    public static void penjumlahan(int a[]) {
        int jum = 0;
        for (int i = 0; i < a.length; i++) {
            jum = jum + a[i];
        }
        System.out.println("Hasil penjumlahan : " + jum);
    }

    public static void pengurangan(int a[]) {
        int kurang = 0;
        for (int i = 0; i < a.length; i++) {
            kurang = kurang + a[i];
        }
        System.out.println("Hasil pengurangan : " + kurang);
    }

    public void perkalian(int a[]) {
        double kali = 0;
        for (int i = 0; i < a.length; i++) {
            kali = kali + a[i];
        }
        System.out.println("Hasil perkalian : " + kali);
    }

    public void pembagian(int a[]) {
        double bagi = 0;
        for (int i = 0; i < a.length; i++) {
            bagi = bagi + a[i];
        }
        System.out.println("Hasil pembagian : " + bagi);
    }

    public void sederhana(int a, int b) {
        double desimal = a / b;
        System.out.println("Hasil penyederhanaan : " + desimal);
    }
}

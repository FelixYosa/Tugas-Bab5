
package tugas1;

public class Penghitungan {
        
    public static void penjumlahan(int a, int b){
        double jum = a+b;
        System.out.println("Hasil penjumlahan : "+jum);
    }
    
    public static void pengurangan(int a, int b){
        double kurang = a-b;
        System.out.println("Hasil pengurangan : "+kurang);
    }
    
    public void perkalian(int a, int b){
        double kali = a*b;
        System.out.println("Hasil perkalian : "+kali);
    }
    
    public void pembagian(int a, int b){
        double bagi = a/b;
        System.out.println("Hasil pembagian : "+bagi);
    }
    
    public void sederhana(int a, int b){
        double desimal = a/b;
        System.out.println("Hasil penyederhanaan : "+desimal);
    }
}

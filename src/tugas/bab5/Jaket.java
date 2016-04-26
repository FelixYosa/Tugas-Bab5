//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package tugas2;

public class Jaket {

    public final int bahanA = 100000;
    public final int bahanB = 125000;
    public final int bahanC = 175000;
    public final int diskonA = 95000;
    public final int diskonB = 120000;
    public final int diskonC = 160000;
    public double total;

    public void setTotal(int jum, int bahan) {
        if (jum <= 100) {
            if (bahan == 1) {
                total = jum * bahanA;
            } else if (bahan == 2) {
                total = jum * bahanB;
            } else {
                total = jum * bahanC;
            }
        } else {
            if (bahan == 1) {
                total = jum * diskonA;
            } else if (bahan == 2) {
                total = jum * diskonB;
            } else {
                total = jum * diskonC;
            }
        }
    }

    public double getTotal() {
        return total;
    }
}

import javax.swing.JOptionPane;

public class Rekursif {
    static int a;
    public static void main(String[] args) {
        a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Baris : "));
        cetakPiramida(0);
    }
    static void cetakPiramida(int i) {
        cetakSpasi(0, i);
        cetakBintang (a, i);
        System.out.println();
        i++;
        if (i<a)
        {
            cetakPiramida(i);
        }
    }
    static void cetakSpasi(int j, int i) {
        if (j<a-i-1)
        {
            System.out.print(" ");
            cetakSpasi(j+1,i);
        }
    }
    static void cetakBintang(int k, int i) {
        if (k>a-i-1)
        {
            System.out.print("* ");
            cetakBintang(k-1, i);
        }
    }
}

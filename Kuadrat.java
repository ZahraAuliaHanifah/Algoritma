import java.util.Scanner;

public class Kuadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Masukkan bilangan : ");
        int bilangan = scanner.nextInt();
        
        int hasil = 0;
        
        for (int i = 0; i < bilangan; i++) {
            hasil += bilangan;
        }
        
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah " + hasil);
    }
}
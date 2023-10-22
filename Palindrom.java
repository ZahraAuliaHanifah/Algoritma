import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);

        String kata;
        String KataPalindrome="";
        int panjangKata;

        System.out.println("\t Menentukan Kata Palindrome \n");

        System.out.print(" Masukan Kata : ");
        kata = userinput.nextLine();
        panjangKata = kata.length();
        
        for(int i = panjangKata - 1; i>= 0; i--){
            KataPalindrome = KataPalindrome + kata.charAt(i);
        }
        if(kata.equals(KataPalindrome)){
            System.out.println("\n kata " + kata + " Adalah Palindrom ");
        }
        else{
            System.out.println("\n kata " + kata + " Bukan Palindrome ");

            userinput.close();
        }
    }
}

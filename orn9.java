import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınan iki sayının çarpımını bulan program//
        Scanner giris= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int s1= giris.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        int s2= giris.nextInt();
        int carpim=s1*s2;
        System.out.println("çarpım sonucu"+carpim);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcının girdiği sayıya kadar olan sayıları toplayan program//
        Scanner giris= new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi= giris.nextInt();
        int toplam=0;
        for(int i=1;i<=sayi;i++){
            toplam+=i;
        }
System.out.println("sayıların toplamı:"+toplam);

    }
}
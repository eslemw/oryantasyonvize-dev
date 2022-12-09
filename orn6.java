
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınan sayıya kadar olan tek sayıların toplamını yazdıran program//
        Scanner giris= new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi= giris.nextInt();
        int toplam=0;

        for(int i=1;i<=sayi;i++){
            if(i%2!=0){
                toplam+=i;
            }
        }
        System.out.println("tek sayıların toplamı="+toplam);
    }
}
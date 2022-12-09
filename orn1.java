
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //girilen sayının mükemmel sayı olup olmadığını bulma//
        Scanner giris= new Scanner(System.in);
        int toplam=0;
        System.out.println("bir sayı giriniz");
        int sayi=giris.nextInt();

        for(int i=1; i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(sayi==toplam){
            System.out.println("mükemmel sayıdır");
        }
        else{
            System.out.println("mükemmel sayı değildir");
        }
    }
}
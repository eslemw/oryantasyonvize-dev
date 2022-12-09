import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //0 ile 1000 arasında random bir sayı oluşturan ve bu sayının rakamlarının toplamını veren program//
        int randomsayi= (int)(Math.random()*(1000));
        System.out.println("random sayı"+randomsayi);
        int birler= randomsayi%10;
        randomsayi=randomsayi/10;
        int onlar=randomsayi%10;
        int yuzler=randomsayi/10;
        System.out.println("toplamları"+(birler+onlar+yuzler));
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//kullanıcıdan alınan sayının 3ün katı olup olmadığını bulma//
        Scanner giris=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=giris.nextInt();

        if(sayi%3==0){
            System.out.println("3ün katıdır");
        }
        else {
            System.out.println("3ün katı değildir");
        }
    }
}
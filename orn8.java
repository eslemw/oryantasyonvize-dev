import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınan sayının negatif mi pozitif mi olduğunu bulan program//

        Scanner giris= new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi= giris.nextInt();
        if(sayi<0){
            System.out.println("sayı negatiftir");
        }
        else{
            System.out.println("sayı pozitiftir");
        }
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan 3 not değeri alıp ortalamasını hesaplayıp 50nin üstüyse geçti altıysa kaldı yazdıran program//
        int not1;
        int not2;
        int not3;
        System.out.println("lütfen notlarınızı giriniz");
        Scanner giris= new Scanner(System.in);
        not1 = giris.nextInt();
        not2 = giris.nextInt();
        not3 = giris.nextInt();
        int ort= (not1+not2+not3)/3;
        System.out.println(ort);


        if (ort<50){
            System.out.println("kaldı");
        }
        else{
            System.out.println("geçti");
        }
    }
}
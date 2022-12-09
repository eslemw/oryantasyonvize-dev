
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan vize ve final notu değerlerini alıp geçti ya da kaldı ve ortalamayı yazdıran program//
        Scanner giris= new Scanner(System.in);
        int vizenotu,finalnotu;
        double ortalama;
        String durum="";
        System.out.println("vize notunuzu giriniz");
        vizenotu=giris.nextInt();
        System.out.println("final notunuzu giriniz");
        finalnotu= giris.nextInt();
        ortalama=vizenotu*0.4+finalnotu*0.6;

        if(ortalama>=50 && finalnotu>=50){
            durum="geçti";

        }
        else{
            durum="kaldı";
        }
        System.out.println("ortalama:"+ortalama);
        System.out.println("durum:"+durum);
    }
}
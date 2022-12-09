import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner giris= new Scanner(System.in);
        System.out.println("bir sayı girin");
        int s1= giris.nextInt();

        Scanner giris2= new Scanner(System.in);
        System.out.println("bir sayı girin");
        int s2= giris.nextInt();

        if(s1>s2){
            System.out.println(s1+"büyüktür"+s2+"sayısından");
        }
        else if(s1<s2){
            System.out.println(s1+"küçüktür"+s2+"sayısından");
        }
else{
    System.out.println(s1+"eşittir"+s2);
        }
    }
}
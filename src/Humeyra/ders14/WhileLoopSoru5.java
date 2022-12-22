package Humeyra.ders14;

import java.util.Scanner;

public class WhileLoopSoru5 {
    public static void main(String[] args) {
     //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi=scan.nextInt();
        System.out.println("Lutfen sayinin ussunu giriniz.");
        int us=scan.nextInt();
        int sonuc=1;

        while (us>=1){
            sonuc*=sayi;
            us--;
        }
        System.out.println("sonuc :"+sonuc);
    }
}

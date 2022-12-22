package Humeyra.ders03;

import java.util.Scanner;

public class ders3modulus {
    public static void main(String[] args) {
        //kullanicidan alinan 3 basamkli bir sayinin rakamlar toplamini bulun.
        // KENDI COZUMUM.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz.");
        int sayi=scan.nextInt(); //567
        int birlerBasamagi=sayi%10;//7
        int onlarBasamagi=(sayi/10);//56
        int onlukDeger=onlarBasamagi%10;//6

        int yuzlerBasamagi=onlarBasamagi/10;//5
        int yuzlukDeger=yuzlerBasamagi%10;//bunu yapmasam da olurdu. 5
        int sonuc=birlerBasamagi+onlukDeger+yuzlukDeger;
        System.out.println(sonuc);

        //HOCANIN COZUMU

        Scanner scan1=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz.");
        int sayi1=scan1.nextInt(); //567
        int birBas=0;
        int rakTop=0;
        birBas=sayi1%10;//7
        rakTop=rakTop+birBas;//7
        sayi1=sayi1/10;//56
        birBas=sayi1%10;//6
        rakTop=rakTop+birBas;//7+6=13
        sayi1=sayi1/10;//5
        birBas=sayi1%10;
        rakTop=rakTop+birBas;
        System.out.println(rakTop);


    }
}

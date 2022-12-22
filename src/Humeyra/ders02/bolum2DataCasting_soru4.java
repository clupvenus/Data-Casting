package Humeyra.ders02;

import java.util.Scanner;

public class bolum2DataCasting_soru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki ondalikli sayi giriniz.");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        int sonuc= (int)((sayi1+sayi2)/2);
        System.out.println(sonuc);
    }
}

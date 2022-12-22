package Humeyra.ders02;

import java.util.Scanner;

public class bolum2DataCasting_soru3 {
    public static void main(String[] args) {
      //  Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int girilenSayi= scan.nextInt();
        byte sonSayi=(byte)girilenSayi;
        System.out.println(sonSayi);

    }
}

package Humeyra.ders11;

import java.util.Locale;
import java.util.Scanner;

public class StringSoru5 {
    public static void main(String[] args) {
        //Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isim giriniz.");
        String isim= scan.nextLine();
        System.out.println("Lutfen soy isminizi giriniz.");
        String soyad= scan.nextLine();
        if(isim.length()>soyad.length()){

            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
            System.out.println(isim+" "+soyad);
        }
        else if(soyad.length()>=isim.length()){
            isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
            soyad=soyad.toUpperCase();
            System.out.println(isim+" "+soyad);
        }

    }
}

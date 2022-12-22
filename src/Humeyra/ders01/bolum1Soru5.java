package Humeyra.ders01;

import java.util.Locale;
import java.util.Scanner;

public class bolum1Soru5 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        char ad= scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen soyadinizi giriniz");
        String soyad= scan.next().toUpperCase();
        System.out.println("Lutfen yasinizi giriniz.");
        int girilenyas=scan.nextInt();

        System.out.println(ad+" "+soyad+" , "+girilenyas);

    }
}

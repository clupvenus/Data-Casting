package Humeyra.ders10;

import java.util.Scanner;

public class ders10IndeksSoru1 {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin
        alin. String’in aranan metni
icerip icermedigini indexOf( ) method’u kullanarak yazdirin.
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle=scan.next();
        Scanner scn=new Scanner(System.in);
        System.out.println("Lutfen aranacak kelime girin.");

        String kelime=scn.next();


        if (cumle.indexOf(kelime)>=0) System.out.println("Aranan metini icerir");
        else System.out.println("Aranan metini icermez.");


    }
}

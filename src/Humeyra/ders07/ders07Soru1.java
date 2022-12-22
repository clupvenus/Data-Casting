package Humeyra.ders07;

import javax.swing.*;
import java.util.Scanner;

public class ders07Soru1 {
    public static void main(String[] args) {
       /* Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz. E:erkek K:kadin");

        char Cinsiyet= scan.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");

        int Yas=scan.nextInt();
        if ((Cinsiyet=='e'||Cinsiyet=='E')&& Yas>=65){
            System.out.println("Emekli olabilirsin");
        }else if ((Cinsiyet=='e'||Cinsiyet=='E')&& (Yas<65&& Yas>18))
        System.out.println("Emekli olmaniz icin "+(65-Yas)+" yil kadar daha calismalisiniz.");

        else if ((Cinsiyet=='k'||Cinsiyet=='K')&& Yas>=60){
            System.out.println("Emekli olabilirsin");
        }else if ((Cinsiyet=='K'||Cinsiyet=='k')&& (Yas<60&& Yas>18))
            System.out.println("Emekli olmaniz icin "+(60-Yas)+" yil kadar daha calismalisiniz.");
        else System.out.println("Gecersiz bilgi");



    }
}

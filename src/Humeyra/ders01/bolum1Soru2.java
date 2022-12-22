package Humeyra.ders01;

import java.util.Scanner;

public class bolum1Soru2 {
    //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
    //yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi giriniz.");
        double girilenSayi=scan.nextDouble();
        System.out.println("lutfen bir tam sayi giriniz.");
        int girilenTamsayi =scan.nextInt();
        System.out.println("sayilarin toplami= "+(girilenTamsayi+girilenSayi)+


                          "\n sayilarin carpimi= "+(girilenTamsayi*girilenSayi));

    }
}

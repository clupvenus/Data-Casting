package Humeyra.ders02;

import java.util.Scanner;

public class bolum2DataCasting_soru5 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ondalikli bir sayi giriniz.");
        double sayi1=scan.nextDouble();
        System.out.println("lutfen bir tamsayi giriniz.");
        int sayi2=scan.nextInt();
        System.out.println((int) (sayi1 / sayi2));

    }
}

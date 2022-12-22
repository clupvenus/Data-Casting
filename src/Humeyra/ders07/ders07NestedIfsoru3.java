package Humeyra.ders07;

import java.util.Scanner;

public class ders07NestedIfsoru3 {
    public static void main(String[] args) {
     /*   Soru 3- Kullanicidan bir sayi alin
     sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin,
        sayi cift sayi ise 10’un tam kati olup olmadigini
                yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        double sayi = scan.nextDouble();

        if (sayi % 2 != 0) {
            if (sayi > 0)
                System.out.println("pozitif tek sayi");

             else if (sayi < 0)
                System.out.println("negatif tek sayi");
            } else if (sayi % 2 == 0) {
                if (sayi % 10 == 0) System.out.println("10`un tam kati");
                else System.out.println("10`un tam kati degil");
            } else System.out.println("galiba sayi girmediniz.");

    }
}


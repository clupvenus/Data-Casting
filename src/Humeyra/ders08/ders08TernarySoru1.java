package Humeyra.ders08;

import java.util.Scanner;

public class ders08TernarySoru1 {
    public static void main(String[] args) {
       /* Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi=scan.nextInt();
        System.out.println((sayi%5==0 ? "Sayi 5`in tam kati" : "Sayi 5 in tam kati degil."));
    }
}

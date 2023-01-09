package Humeyra.ders28;

import java.io.IOException;
import java.util.Scanner;

public class C02_deneme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolmek uzere iki sayi giriniz.");
        int a=scan.nextInt();
        int b=scan.nextInt();


        try {
            System.out.println("sayilarin bolumu : "+a/b);
            System.out.println("kontrol");
            //bu satir calismadi cunku exception calisinca hata olan koddan sonrasini da yazdirmaz
        } catch (ArithmeticException e) {
            System.out.println("Bolen sayi 0 olamaz");
            e.getCause();

            //sebebini yaziyor
            e.printStackTrace();
            //uzun hata mesaji yazar.

        }

         


    }
}

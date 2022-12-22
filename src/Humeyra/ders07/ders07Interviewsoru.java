package Humeyra.ders07;

import java.util.Scanner;

public class ders07Interviewsoru {
    public static void main(String[] args) {
        /*
        Soru ) Interview Question Kullanicidan artik yil olup olmadigini kontrol
etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildi
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz.");
        int yil=scan.nextInt();

    if ((yil%4==0 && yil%100!=0)||yil%400==0 )System.out.println("Artik yil");
   else System.out.println("Artik yil degildir");


    }
}

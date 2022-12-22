package Dersgrubu;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        //        // kullanicidan istedigi kadar sayi alin ve toplayin
        //        // kullanici deger olarak 0'a basarsa islemi bitirin
        Scanner scan=new Scanner(System.in);

        int kullaniciSayisi=1;
        int top=0;
        int count=0;
        do{
            System.out.println("Lutfen bir sayi giriniz.Islemi tamamlamak icin 0 a basiniz.");
            kullaniciSayisi=scan.nextInt();
            top+=kullaniciSayisi;
            count++;
        }while(kullaniciSayisi!=0);
        System.out.println("Sayilarin toplami:"+top+" Toplam islem sayisi: "+count);

    }
}

package Humeyra.ders01;

import java.util.Scanner;

public class bolum1soru1 {
    public static void main(String[] args) {
      //- Kullanicidan uc farkli data turunde deger alip, girilen degerleri aciklamalariyla
        //yazdirin.
        Scanner yeni=new Scanner(System.in);
        System.out.println("lutfen adinizi yaziniz.");
        String ad=yeni.next();
        System.out.println("lutfen esinizin adini giriniz");
        String esininAdi= yeni.next();
        System.out.println("kac cocuk istiyorsunuz?");
        int cocuk=yeni.nextInt();
        System.out.println(ad+"  ve  "+esininAdi+"  evliler."+"\n"+cocuk+"   cocuk istiyorlar." );




    }
}

package Humeyra.ders07;

import java.util.Scanner;

public class ders07NestedIfsoru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen aldiginiz urun adedini giriniz");
        int urunMiktari=scan.nextInt();
        System.out.println("Aldiginiz urunun liste fiyati nedir?");
        int fiyat=scan.nextInt();
        System.out.println("musteri kartiniz var mi? E/H");
        char kart=scan.next().charAt(0);
        if (urunMiktari>10){
            if (kart=='e'|| kart=='E') System.out.println(" %20 indirimli toplam fiyat: "+(fiyat*urunMiktari*0.8));
            else if (kart=='h'||kart=='H') System.out.println(" %15 indirimli toplam fiyat: "+(fiyat*urunMiktari*0.85));
else System.out.println("gecersiz kart bilgisi");

            }
        else if (urunMiktari>=10 && urunMiktari>0) {
            if (kart=='e'|| kart=='E') System.out.println(" %15 indirimli toplam fiyat: "+(fiyat*urunMiktari*0.85));
            else if (kart=='h'||kart=='H') System.out.println(" %10 indirimli toplam fiyat: "+(fiyat*urunMiktari*0.9));
            else System.out.println("gecersiz bilgi");
        }
        else System.out.println("Hatali bilgi");



    }

    }


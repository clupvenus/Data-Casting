package Dersgrubu;

import java.util.Random;
import java.util.Scanner;

public class oyun {
    public static void main(String[] args) {
        //kullanicidan aldigimiz sayi ile sistemin sectigi sayiyi tahmin etmesini bekleyelim.
        Random rn=new Random();
        int gizliSAyi=rn.nextInt(20);
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1-20 arasindan bir sayi tahmin et.");
        System.out.println(gizliSAyi);
        int count=0;

        boolean tahmin=false;
        while(tahmin==false)
        {
            int kullaniciSayisi=scan.nextInt();
            if(kullaniciSayisi>gizliSAyi) {System.out.println("Tahminini kucult.");
            count++;}
            else if(kullaniciSayisi<gizliSAyi){
                System.out.println("Tahminini buyult");
                count++;
            }else{tahmin=true;
            }

        } System.out.println("Count sayisi: "+ count);

        if(count<=3) System.out.println("wooow");
        else if(count<=8) System.out.println("Aferinnn!!");
        else System.out.println("Basarisiz tahmin");

    }
}

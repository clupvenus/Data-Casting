package Humeyra.ders14;

import java.util.Scanner;

public class whileLoopSoru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin.
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin.
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin.
            Scanner scan=new Scanner(System.in);
            int sayi=1;
            int toplam=0;
            int count=0;
            while (sayi!=0){
                System.out.println("Lutfen bir sayi giriniz.");
                sayi=scan.nextInt();
                if(sayi>=1)
                {toplam+=sayi;
                count++;
                }
                else if (sayi<0){
                    System.out.println("Negatif sayi kullanamazsin.");

                }

            }
        System.out.println("sayilarin toplami:"+toplam+" "+count+" tane sayi yazdiniz.");


    }
}

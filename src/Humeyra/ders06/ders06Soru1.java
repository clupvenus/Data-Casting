package Humeyra.ders06;

import java.util.Scanner;

public class ders06Soru1 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip
        // 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz.");
        int girilenSayi= scan.nextInt();
        if(girilenSayi%5 == 0){
            System.out.println("Sayi bes ile tam bolunebilir.");
        }

    }
}

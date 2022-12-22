package Humeyra.ders14;

import java.util.Scanner;

public class WhileLoopSifreSorusu {
    public static void main(String[] args) {
        //Kullanicidan Kullanicidan sifre isteyin asagidaki sartlari saglamayan
        //sifrelerde hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin
        //Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre
        //yazilinca “sifreniz basari ile kaydedildi” yazdirin
        //sartlar :
        //- sifrenin ilk karakteri kucuk harf
        //olmali
        //- sifrenin son karakteri sayi olmali
        Scanner scan= new Scanner(System.in);

          boolean istenensifre=false;
          String sifre="";

          while(istenensifre==false) {
              System.out.println("Lutfen bir sifre giriniz");
               sifre=scan.nextLine();
              if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                  System.out.println("Sifrenin ilk harfi kucuk harf olmali.");

              } else if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                  System.out.println("Sifrenin son karaketeri rakam olmali.");

              } else {System.out.println("Sifreniz basarili");
              istenensifre = true;}
          }
              }


}

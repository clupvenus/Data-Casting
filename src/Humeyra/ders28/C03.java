package Humeyra.ders28;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //kulanicidan toplamak uzere sayilar alin.
        //kullanicinin islemi bitirmesi icin q ya basmasini isteyin.
        //kullanici Q ya bastiginda toplam kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazin.

        Scanner scan= new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarToplami = 0;
        while(sayiAdedi<1000){
        try {


                    System.out.println("Lutfen toplamak icin bir tamsayi girin."+
                            "\n bitirmek icin Q ya basiniz");
                    girilenSayi=scan.nextInt();
                    sayilarToplami+=girilenSayi;
                    sayiAdedi++;



        } catch (InputMismatchException e) {
            String str=scan.nextLine();
            if (str.equalsIgnoreCase("Q")){
            System.out.println("Sayilarin toplami : "+sayilarToplami );
            break;}
            else System.out.println("Yanlis deger girdiniz");
        }

    }}
}

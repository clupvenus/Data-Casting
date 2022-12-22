package Humeyra.ders15;

import java.util.Scanner;

public class DoWhileLoopSoru2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir sifre girmesini isteyin.
        // Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar
        // bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int flag = 0;

        System.out.println("Lutfen bir sifre giriniz.");
        sifre = scan.nextLine();
        if (sifre.length() < 8) {
            System.out.println("Sifre en az 8 karakter olmalidir.");
            flag++;
        }
// bu srou gereksiz zormus onun icini yarim biraktim

        }
    }


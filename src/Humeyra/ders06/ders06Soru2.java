package Humeyra.ders06;

import java.util.Scanner;

public class ders06Soru2 {
    public static void main(String[] args) {
       //Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz.");
        char girilenHarf= scan.next().charAt(0);
        if(girilenHarf== 'o'||girilenHarf=='O'){
            System.out.println("Ocak");

        }
        if(girilenHarf== 's'||girilenHarf=='S'){
            System.out.println("Subat");

        }
        if(girilenHarf== 'm'||girilenHarf=='M'){
            System.out.println("Mart ya da Mayis");

        }
        if(girilenHarf== 'n'||girilenHarf=='N'){
            System.out.println("nisan");

        }
        if(girilenHarf== 'h'||girilenHarf=='H'){
            System.out.println("Haziran");

        }
        if(girilenHarf== 't'||girilenHarf=='T'){
            System.out.println("Temmuz");

        }
        if(girilenHarf== 'a'||girilenHarf=='A'){
            System.out.println("Agustos yada Aralik");

        }
        if(girilenHarf== 'e'||girilenHarf=='E'){
            System.out.println("Eylul ya da Ekim");

        }
        if(girilenHarf== 'k'||girilenHarf=='K'){
            System.out.println("Kasim");

        }
    }
}

package Humeyra.ders10;

import java.util.Scanner;

public class ders10OrnekSoru {
    public static void main(String[] args) {
        /*
SORU : kullanicidan bir mail alin
- mail @ icermiyorsa "gecersiz mail"
- mail @gmail.com icermiyorsa, "mail gmail olmali"
- mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gmail adresi giriniz");
        String str= scan.next();
        if (!str.contains("@")) System.out.println("Gecersiz mail");
        else if (!str.contains("@gmail.com"))System.out.println("mail gmail olmali");
        else if (!str.endsWith("@gmail.com")) System.out.println("mailde yazim hatasi var");
        else System.out.println("e mail gecerli, isleme aliyoruz.");

        }
    }


package Humeyra.ders06;

import java.util.Scanner;

public class ders06soru3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin,
        // sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int girilenSayi= scan.nextInt();
        if (girilenSayi%3 == 0) System.out.println("Bu sayi 3 e bolunebilir");
        if (girilenSayi%5 == 0) System.out.println("Bu sayi 5 e bolunebilir");
    }
}

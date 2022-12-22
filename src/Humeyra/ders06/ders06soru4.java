package Humeyra.ders06;

import java.util.Scanner;

public class ders06soru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise
        //“Eskenar ucgen” yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz.");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0) System.out.println("eskenar ucgendir");
        else System.out.println("Eskenar ucgen degildir");
    }
}

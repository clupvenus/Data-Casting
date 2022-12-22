package Humeyra.ders01;




import java.util.Scanner;

public class bolum1Soru4 {
    //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
    //yazdirin.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen dikdortgenin kenarlarini giriniz.");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("dikdortgenin alani= "+(sayi1*sayi2));
    }
}
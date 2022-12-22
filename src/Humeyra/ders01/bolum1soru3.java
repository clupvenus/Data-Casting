package Humeyra.ders01;

import java.util.Scanner;

public class bolum1soru3 {
    //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    //Isminiz : John
    //Soyisminiz : Doe
    //Yasiniz : 44
    //Kaydiniz basariyla tamamlanmistir
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz.");
        String GirilenAd=scan.next();
        System.out.println("lutfen soy isminizi giriniz.");
        String GirilenSoyad= scan.next();
        System.out.println("lutfen yasinizi giriniz.");
        int GirilenYas=scan.nextInt();
        System.out.println("Adiniz: "+GirilenAd+
                "\nSoyadiniz: "+GirilenSoyad+
                "\nYasiniz: "+GirilenYas+
                "\n Kaydiniz basari ile tamamlanmistir.");
    }
}

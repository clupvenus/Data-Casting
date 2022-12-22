package Humeyra.ders10;

import java.util.Scanner;

public class ders10indeksSoru2 {
    public static void main(String[] args) {
        /*
        * Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
- String aranan metni icermiyor
- Aranan metin String’de sadece 1 kere kullanilmis
- Aranan metin String’de sadece 1’den fazla kullanilmis
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle=scan.nextLine();

        System.out.println("Lutfen aranacak kelime girin.");

        String kelime=scan.nextLine();
        if(cumle.indexOf(kelime)==-1) {
            System.out.println("String aranan metni icermiyor");
        }else if (cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
            System.out.println(" Aranan metin String’de sadece 1 kere kullanilmis");
        }
        else {
            System.out.println("Aranan metin String’de 1’den fazla kullanilmis");
        }



    }
}

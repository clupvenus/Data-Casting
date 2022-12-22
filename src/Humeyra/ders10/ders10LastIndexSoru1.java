package Humeyra.ders10;

public class ders10LastIndexSoru1 {
    public static void main(String[] args) {
        /*
        Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
icerip icermedigini lastIndexOf( ) method’u kullanarak yazdirin.
         */
        String str="hayat seninle guzel";
        String kelime="ilk";
        if (str.lastIndexOf(kelime)==-1) System.out.println("Metni icermiyor");
        else System.out.println("Metni iceriyor.");
    }
}

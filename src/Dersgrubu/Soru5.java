package Dersgrubu;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin
         */
        String ad="humeyra";
        String soyad="uysal";
        if (ad.length()>soyad.length()){
            System.out.println((ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() + " "
                    + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase()));
        }else {
            System.out.println(ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() + " " + soyad.toUpperCase());
        }
    }
}

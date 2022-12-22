package Humeyra.ders13;

public class MethodOlusturmaSoru2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //isim bosluk soyisim seklinde bize donduren bir method olusturun
        //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

      String ad="ali";
      String soyad="yIlMAZ";
        System.out.println(adsoyadYazma(ad, soyad));


    }
    public static String adsoyadYazma(String ad,String soyad){

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

         return ad+" "+soyad;
    }
}

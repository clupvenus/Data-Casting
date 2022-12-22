package Humeyra.ders11;

public class StringSoru4 {
    public static void main(String[] args) {
//Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
//duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
//basariyla kaydedildi" yazdirin
//- ilk harf kucuk harf olmali
//- son karakter rakam olmali
//- sifre bosluk icermemeli
//- uzunlugu en az 10 karakter olmali
        String str="4hs a64;l";
        int flag=0;
        if(!(str.charAt(0)>='a' && str.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        if(!(str.charAt(str.length()-1)>='0'&&str.charAt(str.length()-1)<='9')){
            System.out.println("Son karakter rakam olmali");
            flag++;
        }
        if(str.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag++;
        }
        if(str.length()<10){
            System.out.println("Sifre 10 karakterden fazla olmali");
            flag++;

        }if(flag==0) System.out.println("Sifreniz basarili bir sekilde olusturulmustur.");
    }
}

package Humeyra.ders09;

import java.util.Locale;

public class ders09StringManipulations {
    public static void main(String[] args) {
        String str="Java candir";
        //toUpperCase and toLowerCase



        System.out.println(str.toUpperCase());//JAVA CANDIR.
        System.out.println(str.toLowerCase());//java candir.
// Atama yapilmadan yapilan string manipulasyonlar kalici degisiklik yapmazlar.
        //local dilleri kullanmak istiyorsak method da lokale secenegini secmeliyiz.
        System.out.println(str.toLowerCase(Locale.GERMAN));// java candir.
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));//java candır.
        System.out.println("=======");
        //.equals methodu iki string ifadeyi karsilastirmada kullanilir. integerlardaki == gibi.

        //== isareti stringlerde tavsiye edilmez.
        String str1="fatih";
        String str2="Fatih";
        String str3= new String("Fatih");
        System.out.println(str2.equals(str3));//true
        System.out.println(str1.equals(str2));//false

        System.out.println("======");
        //str.equalsIgnoreCase( baskaStr );
        // verilen stringlerde case-sensitive olmadan ayni ise yani kucuk buyuk harf hassasiyeti aramiyorsak kullaniriz.

        String gun1="Pazar";
        String gun2="PaZAr";
        String gun3="pAZAr";
        System.out.println(gun1.equalsIgnoreCase(gun3));//true
        System.out.println(gun2.equalsIgnoreCase(gun1));//true





    }
}

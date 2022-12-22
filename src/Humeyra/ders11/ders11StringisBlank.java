package Humeyra.ders11;

public class ders11StringisBlank {
    public static void main(String[] args) {
        /*
        String’in bos olmasi(length=0) ile sadece space’lerden olusmasi farklidir.
Space’lerden olusan bir String’in uzunlugu 0 olmayacagi icin isEmpty( ) bize false
döndürür.
Bir String’in sadece space’lerden olusmus oldugunu kontrol icin str.isBlank( )
kullanilabilir.

         */
        String str="  ";
        System.out.println(str.isBlank());//true
        System.out.println(str.isEmpty());//false

    }
}

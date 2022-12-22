package Humeyra.ders10;

public class ders10Stratswith {
    public static void main(String[] args) {
        //str.startsWith ( baskaString );
        //Bir String’in baska bir String ile
        // baslayip, baslamadigini kontrol eder,
        // boolean sonuc döndürür
        String str= "my name is humeyra.";
        System.out.println(str.startsWith("my"));//true.
        System.out.println(str.startsWith("my name"));//true.
        System.out.println(str.startsWith("my name is"));//true.

        // 2 parametre olursa baslangic indeksi secebiliriz.
        System.out.println(str.startsWith("me",5));//true
        System.out.println(str.startsWith("my name",5));//false
    }
}

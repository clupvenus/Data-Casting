package Humeyra.ders09;

public class ders09Contains {
    public static void main(String[] args) {
        //9. str.contains ( baskaString );
        //Bir String’in baska bir String’i icerip icermedigini kontrol eder,
        // boolean sonuc döndürür.
        //Aranan String’in kac tane oldugunu tespit edemez,
        // sadece var veya yok cevabi verir

     String str="Java cok guzel, cok..." ;
        System.out.println(str.contains("Java"));
        //true
        System.out.println(str.contains("cok"));
        //true
        System.out.println(str.contains(","));
    }
}

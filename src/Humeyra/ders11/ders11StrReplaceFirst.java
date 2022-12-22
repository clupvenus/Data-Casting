package Humeyra.ders11;

public class ders11StrReplaceFirst {
    public static void main(String[] args) {
        //Bir String’in icinde bulunan degisecekString’lerden ilkini yeniDeger yapar.
        //degisecekString String olabilecegi gibi regex de olabilir
      //
        /*Regex (Regular Expressions)

\\s : space \\S : space olmayan hersey
\\s+ : yanyana birden fazla space
\\d : digits \\D : digit olmayan hersey
\\w : harf veya rakam \\W : harf veya rakam olmayan hersey
*/
         String str="Herkesin github u olmali.";
        System.out.println(str.replaceFirst("\\s","5"));

        //Herkesin5github u olmali.
        str="Herkesin 15645 tane hesabi omasina gerek yok.";
        System.out.println(str.replaceAll("\\d","cok"));
        //Herkesin cokcokcokcokcok tane hesabi omasina gerek yok.
        // kac tane rakam varsa o kadar yazdi.
        System.out.println(str.replaceFirst("\\d","cok"));
        //Herkesin cok5645 tane hesabi omasina gerek yok

    }
}

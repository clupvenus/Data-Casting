package Humeyra.ders09;

public class ders09strSubstring {
    public static void main(String[] args) {
       /* Verilen bir String’in istedigimiz bir bolumunu bize döndürür. Istedigimiz bolume uygun
        olarak 1 parametre veya 2 parametreli 2 farkli kullanimi vardir
        str.substring( tekParametre );
        Parametre olarak girilen index’den String’in sonuna kadar olan bolumunu bize
        döndürür.*/
        String str="Hayat guzeldir.";
        System.out.println(str.substring(8));//zeldir

        // eger sondan istenilen karakter giriliyorsa
        System.out.println(str.substring(str.length()-6));//eldir
        //iki parametreli yani baslangic ve bitis belirtilerek yazdirilabilri.

        System.out.println(str.substring(6,9));//guz
        // ilk indeksi yazdirir son indeksi yazdirmaz. bu ornek icin 6 7 8. indeksleri yazdirir.




    }
}

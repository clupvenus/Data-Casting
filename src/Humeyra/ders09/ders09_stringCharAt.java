package Humeyra.ders09;

public class ders09_stringCharAt {
    public static void main(String[] args) {
        // char.At methodu string bir ifadedeki istenilen indeksi yazdirmaya yada atamay yarar

        String str="Java candir";
        System.out.println(str.charAt(0));//j
        System.out.println(str.charAt(3));//a
        System.out.println(str.charAt(10));//r
        //indeksler sifirdan baslar. yani birinci harf indeksi sifirdir.
        // son karakter te indeks sifirdan basladigi icin Index sayisi-1`dir.
        // indeks sayisindan fazla bir deger girince java hata verir.
       /*
        System.out.println(str.charAt(15));
        //hata verdi.
        */




    }
}

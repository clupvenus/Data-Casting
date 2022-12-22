package Humeyra.ders11;

public class ders11NullPointer {
    public static void main(String[] args) {
      String isim1=null;
      String isim2;
      String isim3="";
      //Isim3’e bir deger atanmistir. Bu degeri yazdirabilir veya
        //method’larda kullanilabilir
       /*
       isim1 ve isim2’nin durumlari biraz daha benzerdir.
Ikisi de olusturulmus ve ikisine de deger atanmamistir.
Isim1 null pointer ile isaretlendigi icin Java isim1’in kullanim sorumlulugunu bize
birakir.
Isim2’yi kullanmaniza ise (deger atanmadigi surece) izin vermez
        */
      //  System.out.println(isim2); isim2 yi kullanamiyoruz
        System.out.println(isim1);// null yazdirir
        //System.out.println(isim1.length());//.NullPointerException
        // uzunluk yok
        System.out.println(isim3);// hic bir sey yazdirmaz

        System.out.println(isim3.length());//0



    }
}

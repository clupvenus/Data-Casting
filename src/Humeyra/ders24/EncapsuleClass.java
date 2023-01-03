package Humeyra.ders24;

public class EncapsuleClass {
   /*
   Encapsulation ile istedigimiz degere erisimin olmasi icin read ve write ozelligini ayri ayri verebiliriz.

    */
   private int satis;
    public void setSatis(int satis) {
        this.satis = satis;
        topSatis+=satis;
    }
    //Encapsule class da satis degerine setter methodu olusturarak diger class lardan deger girebilme yetkisi vermis olduk.
    private int topSatis=0;
//Toplam satisi da sadece okunabilir yapmak istiyoruz.
    //Ozaman onu da getter yapalim
    public int getTopSatis() {
        return topSatis;
    }
    private int halkaAcikSayi=10;

    //Bu sayi hem deger atamasi yapilir hem de yazdirilir.
    public int getHalkaAcikSayi() {
        return halkaAcikSayi;
    }

    public void setHalkaAcikSayi(int halkaAcikSayi) {
        this.halkaAcikSayi = halkaAcikSayi;
    }



}

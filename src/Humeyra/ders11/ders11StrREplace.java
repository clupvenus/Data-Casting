package Humeyra.ders11;

public class ders11StrREplace {
    public static void main(String[] args) {
        //Bir String’in icinde bulunan degisecekString’lerin tumunu yeniDeger yapar.
        //Parametre olarak char da kullanilabilir, bu durumda degisecekChar’larin tumunu
        //yeniChar yapar
        String str="Java ogren isi kap.";
        System.out.println(str.replace('J','T'));
        //Tava ogren isi kap.
        System.out.println(str);
        //java ogren isi kap. gecici olarak degistirdi. kalici olmasini istiyrsak atama yapmaliyiz.
        str= str.replace("isi","offer`i");

        System.out.println(str);
        //Java ogren offeì kap.


    }
}

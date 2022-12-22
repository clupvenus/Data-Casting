package Humeyra.ders02;

public class ders2dataTurleri {
    public static void main(String[] args) {
// data turleri ve yazilma sekilleri

        boolean ogrenciMi = true;
        char harf = 's';
        //'4' yada '%' gibi karakter de olabilir. onemli olan tek bir sayi harf yada karakter olmasidir.
        byte b=127;
        //-128 ile 127 arasindaki sayilar
        short s=32767;
        //max/min +-32767
        int i=21566451;
        //2 uzeri 32
        long l=1233223333333333l;
        //2 uzeri 63 ve yanina l yada L yazmaliyiz
        float f=1.256f;
        double d=3566.2556;

        // float icinde sayinin sonuna f yazmaliyiz.virgulden sonra 67 basamak
        //double virgulden sonra 15 16 basamak
        float x1=5f;
        float x2=3f;
        System.out.println(x1/x2);
        double d1=25;
        double d2=6;
        System.out.println(d1/d2);

    }
}
package Humeyra.ders23;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime zaman=LocalTime.now();
        System.out.println(zaman);//20:01:41.046770200
        System.out.println(zaman.getMinute());//2
        System.out.println(zaman.withSecond(0).withNano(0));//20.03
        System.out.println(zaman.plusHours(100).plusMinutes(250));
        //04:14:38.369108700
        //bir forloop ile birden 10000 e kadar olan sayilari yazdirin
        //bu islem icin gecen sureyi bulunuz.
         LocalTime basZaman=LocalTime.now();
        System.out.println("baslangic "+basZaman);//20:09:31.657957
        for (int i = 1; i <10000 ; i++) {
            System.out.print(i+" ");

        }
        System.out.println("");
        LocalTime bitZaman=LocalTime.now();
        System.out.println("bitis "+bitZaman);//bitis 20:09:31.752914800

        System.out.println("islem zamani "+(bitZaman.getNano()-basZaman.getNano())+" nano saniye");



    }
}

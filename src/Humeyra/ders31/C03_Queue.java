package Humeyra.ders31;


import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();

        harfler.add("H");
        harfler.add("K");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//[H, K, B, K]

        //1. indexe birsey eklemek yok
        //  queue ozelliginden dolayi sadece sona eklenebilir.
        //yemek kuyrugu sirasina benzetilebilir. gelen arkaya girer araya giremez.
        // harfler.add(1,"k")

        System.out.println(harfler.remove());//H

        //eklerken sondan silerken bastan siliyor.

        System.out.println(harfler.remove("K"));// gordugu ilk K yi siler.

        System.out.println(harfler.element());//B

        //listenin basindaki elementi getirir ama silmez.

        System.out.println(harfler.peek());//B
        // elementle aynidir farki bos bir listeden element CTE verirken peek vermez.

        Queue<String> karakterler=new LinkedList<>();
      //  System.out.println(karakterler.element()); CTE veriyor.

        System.out.println(karakterler.peek());//null


        System.out.println(harfler.poll());//B
        //ilk elemani bize dondurur ve siler bossa da null dondurur. Remove ile farki remove boossa hata verir poll vermez.

        System.out.println(harfler.offer("K"));//true
        // add le ayni buradaki fark sadece offer da kapasite onemli . kapasiteyi asinca ekleme yapmaz.
        System.out.println(harfler);//[K, K]


    }
}

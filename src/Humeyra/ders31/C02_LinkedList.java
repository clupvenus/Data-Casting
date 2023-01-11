package Humeyra.ders31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {
    //List data turunde bir linked list olusturalim.

        List<String> harfler=new LinkedList<>();


        harfler.add("H") ;
        harfler.add("K");
        harfler.add(1,"L");
        //[H, L, K]

        System.out.println(harfler);
        harfler.set(1,"M");
        System.out.println(harfler);
        //[H, M, K]


        List<String > karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("#");
        karakterler.add("9");
        karakterler.add(2,"M");
        System.out.println(karakterler);

        System.out.println(harfler.retainAll(karakterler));//true
        System.out.println(harfler);//[M]

        // karaktererle ortak olan elementler disindaki elementleri sildi.




        System.out.println(harfler.addAll(karakterler));
        System.out.println(harfler);//[M, *, #, M, 9]
        System.out.println(harfler.removeAll(karakterler));
        System.out.println(harfler);


        System.out.println(karakterler.subList(1, 3));
        karakterler.hashCode();


    }
}

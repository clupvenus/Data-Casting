package Humeyra.ders30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);
        //tum elemntleri index kullanmadan 3 artirin.

        ListIterator lit=sayilar.listIterator();
        System.out.println(sayilar);//[5, 23, 2, 9, 11]
        while (lit.hasNext()){
            Integer sayi=(Integer) lit.next();
            lit.set(sayi+3);
        }
        System.out.println(sayilar);//[8, 26, 5, 12, 14]
        //L
        //Listedeki tum elementleri sondan basa yazdirin.
        //Su anda listemiz en sonda zaten basa donelim

        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
//14 12 5 26 8











    }
}

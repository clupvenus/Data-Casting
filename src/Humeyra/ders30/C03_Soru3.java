package Humeyra.ders30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Soru3 {
    public static void main(String[] args) {

            List<Integer> sayilar=new ArrayList<>();
            sayilar.add(5);
            sayilar.add(23);
            sayilar.add(2);
            sayilar.add(9);
            sayilar.add(11);
            System.out.println(sayilar);
             //[5, 23, 2, 9, 11]
            //Tum elentleri 5 artirin.

        ListIterator lit=sayilar.listIterator();

        while (lit.hasNext()) {
            lit.set((Integer) lit.next() + 5);

        }
        System.out.println(sayilar);
        //[10, 28, 7, 14, 16]
    }



}

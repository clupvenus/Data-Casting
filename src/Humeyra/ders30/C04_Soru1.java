package Humeyra.ders30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_Soru1 {
    public static void main(String[] args) {
      /*
      Soru 1) Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program
yaziniz . (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
       */

        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator<Integer> lit=list.listIterator();
        while (lit.hasNext()){
             Integer sayi=(Integer) lit.next();
            if(sayi<20||sayi>40) lit.remove();

        }
        System.out.println(list);
        //[23, 40]







    }
}

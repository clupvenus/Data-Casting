package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;

public class C08_foreach {
    public static void main(String[] args) {
        Integer[] arr={2,3,4,5,6,7,8,9};
        List<Integer> list1=new ArrayList<>();
        //arraydeki tum elemenleri liste kopalayalim.
        for (Integer each:arr
             ) {
            list1.add(each);

        }
        System.out.println(list1);
        //arraydeki cift sayilari tasiyalim
        List<Integer> list2=new ArrayList<>();
        for (int each:arr
             ) {if (each%2==0){list2.add(each);}

        }
        System.out.println("Cift sayilar arrayi :" +list2);
        //Cift sayilar arrayi :[2, 4, 6, 8]
    }
}

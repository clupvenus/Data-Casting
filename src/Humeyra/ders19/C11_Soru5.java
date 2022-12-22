package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;

public class C11_Soru5 {
    public static void main(String[] args) {
        //soru5:Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.
        int[] arr1={2,4,6,7,8,9,4,5,2,5,8,5,6};
        int[] arr2={4,6,8,9,5,2,3,1};
        List<Integer> ortakELeman= new ArrayList<>();
        for (int each1:arr1
             ) {
            for (int each2:arr2
                 ) {if(each1==each2&&!ortakELeman.contains(each1))

                 {ortakELeman.add(each1);
                 }

            }

        }
        System.out.println(ortakELeman);
    }
}

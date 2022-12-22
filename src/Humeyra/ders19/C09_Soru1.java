package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;

public class C09_Soru1 {
    public static void main(String[] args) {
//Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
//elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.
        int[] arr={1,2,5,6,4,3,2,5,6,5,8,7,9,7,8,9};
        List<Integer> list=new ArrayList<>();
        for (int each:arr
             ) {
            if(!list.contains(each)){
                list.add(each);}

        }
        System.out.println(list);
    }
}

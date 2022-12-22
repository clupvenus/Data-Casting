package Humeyra.ders19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArraydenListYapma {
    public static void main(String[] args) {
        Integer[] arr={2,3,4,5,6,7,8,9};
        // 1. yontem loop ile cozmek

        List<Integer> list1=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            list1.add(arr[i]);

        }
        System.out.println("Loop ile tasinan list : "+list1);
        //2. yontem aslist methodu

        List<Integer> list2= Arrays.asList(arr);
        System.out.println(list2);
        //yapmak kolay ama 2 dezavantaji var
        //aslist ile olusturulan listlerde add remove gibi methodlari kullanamiuoruz.
        //aslist il eolusturulan listelerde array degerlerini degistirince list de degisir.
        //aslist ile olusturulan array ve list birbirine yapisik.




    }
}

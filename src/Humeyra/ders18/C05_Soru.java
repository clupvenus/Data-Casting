package Humeyra.ders18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Soru {
    public static void main(String[] args) {


        //verilen bir arraydeki tekrar eden elementleri silip arrayi unique bir array haline getirin.
        int[] arr = {4, 5, 6, 1, 2, 7, 4, 5, 6, 8, 1, 2, 3, 9, 4};

        List<Integer> uniq = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!uniq.contains(arr[i])){
                uniq.add(arr[i]);
            }

        }
        System.out.println(uniq);//[4, 5, 6, 1, 2, 7, 8, 3, 9]
        arr=new int[uniq.size()];
        for (int i = 0; i < arr.length; i++) {

          arr[i]=uniq.get(i);

        }
        System.out.println(Arrays.toString(arr));//[4, 5, 6, 1, 2, 7, 8, 3, 9]





    }
}
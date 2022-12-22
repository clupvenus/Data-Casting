package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C04_contains {



    public static void main(String[] args) {

   int[] arr={4,5,6,1,2,7,4,5,6,8,1,2,3,9,4};
   List<Integer> sayilar=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar.contains(3));//true



    } }
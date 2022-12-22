package Humeyra.ders17;

import java.util.Arrays;

public class C04Equals {
    public static void main(String[] args) {
        int[] arr1={3,5,0};
        int[] arr2={3,0,5};
        System.out.println(Arrays.equals(arr1, arr2));//false olarak dondu. siralama onemli
        //siralamanin onemi yoksa iki arrayi sort yapalim.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));//true

    }
}

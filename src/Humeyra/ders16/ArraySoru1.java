package Humeyra.ders16;

import java.util.Arrays;

public class ArraySoru1 {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(artirma(arr)));
        //[3, 4, 5, 6, 7]

    }
    public static int[] artirma(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=2;

        }


        return arr;
    }




}

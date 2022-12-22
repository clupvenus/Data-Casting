package Humeyra.ders16;

import java.util.Arrays;

public class ArrayYEniDegerAtama {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] temp=new int[5];
        for (int i = 0; i < arr1.length ; i++) {
            temp[i]=arr1[i];

        }
        System.out.println(Arrays.toString(arr1));//[1, 2, 3]
        System.out.println(Arrays.toString(temp));//[1, 2, 3, 0, 0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 0, 0]



    }

}

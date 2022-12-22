package Humeyra.ders17;

import java.util.Arrays;

public class C05MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        //int[][] arr={arr[0],arr[1],arr[2],arr[3],arr[4]};
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//3
        System.out.println(arr[2][1]);//4 3.elemmentin 2. elemnti
        System.out.println(arr[3]);// referans ismini yazdirir.
        //MdA yi yazmak icin deeptoString methodu kullanilir.
        System.out.println(Arrays.deepToString(arr));
//[[3, 1, 2, 4], [1, 2], [3, 4, 5], [10], [2, 7]]


    }
}

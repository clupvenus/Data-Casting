package Humeyra.ders16;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int [] arr={1,5,4,7,8,12,45};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }//1 5 4 7 8 12 45

        System.out.println(Arrays.toString(arr));
        //[1, 5, 4, 7, 8, 12, 45] boyle yazarsak
    }
}

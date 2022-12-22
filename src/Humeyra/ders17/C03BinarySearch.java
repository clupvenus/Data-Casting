package Humeyra.ders17;

import java.util.Arrays;

public class C03BinarySearch {
    public static void main(String[] args) {
        //binary tree javanin ozel bir siralama yontemidir.
      int[] arr={2,6,9,3,15,1,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       // [1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 3));//2
//Sonuc bize indeksi dondurur.
        //sort yapmadan sonuc cikmaz.mutlaka sort yapmaliyiz.
        //peki olmayan element aranirsa ne olur?
        System.out.println(Arrays.binarySearch(arr,4));//-4
        //burada soyle bir ipucu var eger 4 olsaydii kacinci indekste olacaktiysa oun negatif degeri olur.


    }
}

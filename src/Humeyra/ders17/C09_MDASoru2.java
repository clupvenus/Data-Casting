package Humeyra.ders17;

import java.util.Arrays;

public class C09_MDASoru2 {
    public static void main(String[] args) {
        /*Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]*/
        int[][] arr = {{3,4,5}, {2,3,6,7},{4,3}};
        //en kisa arrayi lengthini bulmamiz lazim
        int enkisaLength=arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length<enkisaLength){
                enkisaLength=arr[i].length;
            }

        }

        int[] toplam=new int[arr[enkisaLength].length];
        for (int i = 0; i < toplam.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
                toplam[i]+=arr[j][i];

            }

        }
        System.out.println(Arrays.toString(toplam));


    }
}

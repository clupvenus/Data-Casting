package Dersgrubu;

import java.util.Arrays;

public class SoruArray3 {
    public static void main(String[] args) {
        //Soru)Asagidaki multi dimensional array’in ic array’lerindeki tum elemanlarin toplamini
        //birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’i ekrana
        //yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6,7} }
        //Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}

        int[][]arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] newArray=new int[arr.length];
        int top=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                top+=arr[i][j];
                newArray[i]=top;

            }
            top=0;

        }
        System.out.println(Arrays.toString(newArray));
    }
}

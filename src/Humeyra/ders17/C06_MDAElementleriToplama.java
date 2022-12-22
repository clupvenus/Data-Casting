package Humeyra.ders17;

public class C06_MDAElementleriToplama {
    public static void main(String[] args) {
        //MDA nin tum elemanlarini toplayan bir method olustur.
        int[][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        ElemanlarToplami(arr);


    }
    public static void ElemanlarToplami(int[][]arr){
        int top=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                top+=arr[i][j];

            }

        }

        System.out.println(top);
    }
}

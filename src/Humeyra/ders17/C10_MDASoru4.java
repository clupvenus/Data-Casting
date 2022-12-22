package Humeyra.ders17;

public class C10_MDASoru4 {
    public static void main(String[] args) {
       // Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        int[][] arr = {{3,4,5}, {2,3,6,7},{4,3}};
        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                carpim*=arr[i][j];

            }

        }
        System.out.println("Sonuc : "+carpim);
    }
}

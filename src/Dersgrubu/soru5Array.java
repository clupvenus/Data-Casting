package Dersgrubu;

public class soru5Array {
    public static void main(String[] args) {
      // Soru 5- Verilen 2 katli bir array'de her bir inner array'in son elementlerinin
        //toplaminini yazdiran bir method olusturun.
        int[][]arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7},{1,5,9}};

        System.out.println(donus(arr));


    }
    public static int donus(int[][]arr){

        int top=0;
        for (int i = 0; i < arr.length; i++) {
            top+=arr[i][arr[i].length-1];


        }


        return top;
    }
}

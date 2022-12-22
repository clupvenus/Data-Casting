package Humeyra.ders17;

public class C12_MDASoru5 {
    public static void main(String[] args) {
        //Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //toplaminini yazdiran bir method olusturun.
        int[][] arr = {{3,4,5}, {2,3,6,7},{4,3}};

sonElementiTopla(arr);


    }
    public static void sonElementiTopla (int[][] arr){

        int top=0;
        for (int i =0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j < arr[i].length; j++) {
                top+=arr[i][j];

            }



        }
        System.out.println("Son elemntlerin toplmai: "+top);
    }
}

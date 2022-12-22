package Humeyra.ders16;

public class ArraysSoru2 {
    public static void main(String[] args) {
    //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
      int[] arr={-2,4,-40,-6,-7,-2};
      int top=0;
        System.out.println(toplama(arr,top));


    }
    public static int toplama(int[] arr, int top){
        top=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0) {
                top+=arr[i];
            }
        }
        return top;
    }



}

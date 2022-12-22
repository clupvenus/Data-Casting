package Humeyra.ders16;

public class Arrays2 {
    public static void main(String[] args) {
        //Verilen bir arraydeki istenen bir elemanin var olup olmadigini
        //ve varsa kac kere kullanildigini yazdiran bir method yapiniz.

        int[]arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int arananSayi=4;
        elemanBul(arr,arananSayi);




    }
    public static void elemanBul(int[] arr,int arananSayi){
      int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arananSayi == arr[i]){
                sayac++;
            }

        } if (sayac== 0) System.out.println("aranan sayi arrayde yok");
          else  System.out.println("Aranan sayi "+arananSayi+" ,"+sayac+" kere bulunuyor");



    }
}

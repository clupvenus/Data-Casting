package Humeyra.ders16;

public class ArraysSoru4 {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.
       int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
       KackereKullanildi(arr,2);


    }
    public static void KackereKullanildi (int[] arr, int arananSayi){
  int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }

        }
        if(sayac==0){
            System.out.println("Aranan sayi bulunmuyor.");
        }else System.out.println("Aranan sayi "+arananSayi+" array de "+sayac+"kere kullanilmistir");


    }
}

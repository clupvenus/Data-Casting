package Humeyra.ders01;

import java.util.Scanner;

public class bolum1Soru7 {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi1 i giriniz.");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen sayi2 i giriniz.");
        int sayi2= scan.nextInt();
        /* sayilarin yerini degistiryi 3 adimda yapiyoruz
         * 1 adim bos bir kova aliyoruz
         * 2. adim 1 sayiyi bos kovaya bosaltiyoruz
         * 3. adim sayi2 yi sayi 1 e aliyoruz
         * sonra bos kovadan sayi2 yi alip sayi 1 e gonderiyoruz. */
        int temp;
        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;
        System.out.println("sayilarin yerini degistirdim"
                +" \nsayi1 in yeni degeri:  "+sayi1

                +"\n sayi2 nin yeni degeri:   "+sayi2);


    }
}

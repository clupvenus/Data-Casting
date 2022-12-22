package Dersgrubu;

public class orneksoru2 {
    public static void main(String[] args) {
      /*  2- while döngüsünü kullanarak verilen bir sayinin oncesinde  gelen
        10 tane sayinin toplamini bulunuz,hem for hem while kullanarak yapabilir miyiz diye deneyelim

       */

        int top=0;

        int sayi2=25;
        for (int i = sayi2-1; i >=sayi2-10 ; i--) {
            top+=i;

        } System.out.println(top);

        int sayi1=50;
        int toplam1=0;
        while(sayi1>40){
            toplam1+=sayi1;
            sayi1--;

        }
        System.out.println(toplam1);








    }
}

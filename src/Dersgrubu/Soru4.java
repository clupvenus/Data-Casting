package Dersgrubu;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
       //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
       // bolenleri sayisini bulup bize donduren bir method olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bolenlerini bulmak icin sayi giriniz.");
        int sayi=scan.nextInt();
        System.out.println(pozitifbolen(sayi));
        int a=pozitifbolen(32);
        System.out.println(a);

    }
    public static int pozitifbolen(int sayi2){
        int count=0;
        for (int i = 1; i <=sayi2 ; i++) {
            if(sayi2%i==0){
                count++;
            }

        }return count;

    }
}

package Humeyra.ders12;

import java.util.Scanner;

public class ders12_forloopsSoru5 {
    public static void main(String[] args) {
//Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
//hesaplayin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz.");
        int sayi=scan.nextInt();
        int faktoriyel=1;
        for (int i =1; i<=sayi ; i++) {

           faktoriyel*=i;


        } System.out.println(faktoriyel);


    }
}

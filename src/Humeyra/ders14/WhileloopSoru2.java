package Humeyra.ders14;

import java.util.Scanner;

public class WhileloopSoru2 {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = scan.nextInt();
        int rakamlarToplami = 0;
        while(sayi>0){
            rakamlarToplami+=sayi%10;
            sayi=sayi/10;
        }
        System.out.println("Rakamlar toplami: "+rakamlarToplami);


    }
}

package Humeyra.ders14;

import java.util.Scanner;

public class WhileLoop500eulas {
    public static void main(String[] args) {
        //Soru : Kullanicidan toplanmak uzere sayilar isteyin toplam 500 olur veya gecerse
        //toplami yazdirin.
        Scanner scan=new Scanner(System.in);

        int sayi=0;

        while(sayi<500){
            System.out.println("Lutfen toplamak uzere bir tamsayi giriniz.");
            int toplanacakSayi= scan.nextInt();
            sayi+=toplanacakSayi;


        }
        System.out.println("Sayilarin toplami: "+sayi+" Daha fazla sayi girmenize gerek yok");
    }
}

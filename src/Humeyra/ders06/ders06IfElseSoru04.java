package Humeyra.ders06;

import java.util.Scanner;

public class ders06IfElseSoru04 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf
        //olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenHarf=scan.next().charAt(0);
        if(girilenHarf>= 'A' && girilenHarf <= 'Z') System.out.println("Buyuk Harf");
        else System.out.println("Buyuk harf degil");
    }
}

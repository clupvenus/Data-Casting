package Humeyra.ders06;

import java.util.Scanner;

public class ders06IfElsesoru03 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin
        // calismasi gereken yil sayisini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int girilenYas = scan.nextInt();
        if(girilenYas>=65) System.out.println("Emekli olabilirsin");
        else if(girilenYas<65 && girilenYas>=18) System.out.println("Emekli olman icin "+(65-girilenYas)+" kadar daha calismalisin.");
        else if(girilenYas<18 && girilenYas>0) System.out.println("Daha cocuksun. Bunlari dusunme");
        else System.out.println(" gecersiz yas");
    }

}

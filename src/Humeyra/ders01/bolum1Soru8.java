package Humeyra.ders01;

import java.util.Scanner;

public class bolum1Soru8 {
    public static void main(String[] args) {
        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
degerlerini degistirin(swap)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi aliniz");
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        //bunu yapamadim ama bir cozum olarak sunu yapmislar ama anlamadim

        sayi2= sayi1+sayi2;
        sayi1=sayi2-sayi1;
        sayi2= (sayi2-sayi1);
        System.out.println("sayi 2 nin yeni degeri :"+sayi2);

        System.out.println("sayi1 in yeni deger :"+sayi1);
    }
}

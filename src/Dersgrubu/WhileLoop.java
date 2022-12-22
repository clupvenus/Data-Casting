package Dersgrubu;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        //  //Kullanicidan toplmaka uzere bir sayi alin.
        //        //Girilen sayilarin toplai 500 olur veya gecerse
        //        // "bu kadar sayi yeter" deyip toplami yazdirin.

        Scanner scan=new Scanner(System.in);

        int count=0;
        int toplam=0;
        while (toplam<500){

            System.out.println("Lutfen toplama yapmak icin bir sayi giriniz");
            int sayi=scan.nextInt();
            toplam+=sayi;
            count++;
        }
        System.out.println("bu kadar yeter.Toplam: " +toplam+" ****"+count+" seferde ulasilmistir");
    }
}

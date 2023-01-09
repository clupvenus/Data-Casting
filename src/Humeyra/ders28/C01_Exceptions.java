package Humeyra.ders28;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        //kullanicidan iki sayi alin ve bu iki sayinin bolumunu yazdririn.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolmek uzere iki sayi giriniz.");
        int a=scan.nextInt();
        int b=scan.nextInt();


        try {
            //try bolumu : yapmak istedigimiz ama exc riskl  i olan bolum
            System.out.println("iki sayinin bolumu "+a/b);
        } catch (ArithmeticException e) {
            //bekledigimiz muhtemel exc deklare ettigimiz
            //bu exc gerceklesirse hata dokumanini store edebilecegimiz variabla
            //burada kodun devam etmesini istiyorsak alttaki kismi silmeliyiz onun yerine baska bir kod da yazabiliriz.
       // throw new RuntimeException(e);
            // catch blogu: exception gerceklesirse calismasini istedigimiz kodlar
            System.out.println("Bolecek sayi sifir olamaz");

                    }

        System.out.println("Hello");


    }



}

package Humeyra.ders15;

import java.util.Scanner;

public class doWhileLoopSoru3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true değilse false yazdırınız.
        //Ornek : input : 16, output: 4
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int input = scan.nextInt();
        int output = 1;
        boolean sonuc = false;
      /*  while (output * output <= input) {
            if (output * output == input) {
                System.out.println("girilen sayinin karakoku :"+output);
                sonuc = true;
                break;
            } else {
                output++;
            }
        }
        System.out.println("Sonuc:"+sonuc);*/
// do while ile yapalim.
        do{
            if (output * output == input) {
                System.out.println("girilen sayinin karakoku :"+output);
                sonuc = true;
                break;
            } else {
                output++;
            }

        }while (output * output <= input);
        System.out.println("Sonuc:"+sonuc);


    }

}
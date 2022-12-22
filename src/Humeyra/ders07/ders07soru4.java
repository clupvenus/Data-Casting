package Humeyra.ders07;

import java.util.Scanner;

public class ders07soru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("bir gun ismi yaziniz.");
        String gun=scan.next();
        if (gun.equalsIgnoreCase("cumartesi")||gun.equals("pazar")) System.out.println("dinlenme zamani");
        else if (gun.equalsIgnoreCase("pazartesi")) System.out.println("simdi calisma zamani tatile 5 gun var");
        else if (gun.equalsIgnoreCase("sali")) System.out.println("simdi calisma zamani tatile 4 gun var");
        else if (gun.equalsIgnoreCase("carsamba")) System.out.println("simdi calisma zamani tatile 3 gun var");
        else if (gun.equalsIgnoreCase("persembe")) System.out.println("simdi calisma zamani tatile 2 gun var");
        else if (gun.equalsIgnoreCase("cuma")) System.out.println("simdi calisma zamani tatile 1 gun var");
        else System.out.println("gecersiz gun bilgisi. Lutfen kucuk harfle girmeyi deneyiniz.");
//burada equals ignore case diye karsilastirirsak boylece kullanici buyuk harfle baslayan bir gun yazsa da aybi sonucu verecektir.
    }
}

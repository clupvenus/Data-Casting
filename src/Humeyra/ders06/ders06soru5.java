package Humeyra.ders06;


import java.util.Scanner;

public class ders06soru5 {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan notunu alin 50 veya daha buyukse
        // ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not= scan.nextInt();
        if (not>=50) System.out.println("sinifi gectin");
        else System.out.println("Malesef kaldin");

    }
}

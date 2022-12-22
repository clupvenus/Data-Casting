package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Soru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        //kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz.");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        String harf= scan.next();
        String[] cumlearr= cumle.split("");
        //cumlenin tum karakterlerini bir array yaptik
        int sayac=0;
        for (String eachHarfler:cumlearr
             ) {if(eachHarfler.equals(harf)){
                 sayac++;
        }
            
        }
        System.out.println("Aradiginiz harf cumlede "+sayac+" kadar bulunmaktir.");
        



    }
}

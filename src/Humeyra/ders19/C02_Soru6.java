package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Soru6 {
    public static void main(String[] args) {
//Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
//tamsayilari bir liste olarak bize donduren bir method olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        if(sayi<=0){
            System.out.println("Gecersiz sayi");
        }else{
          List<Integer> tamBolenlerListesi=BolenlerList(sayi);
        System.out.println(BolenlerList(sayi));}
        //hem yazdirdik hem de dondurduk.


    }
    public static List<Integer> BolenlerList(int sayi){


        List<Integer> bolenlerListesi=new ArrayList<>();
        for (int i =1 ; i <=sayi; i++) {
           if(sayi%i==0){
            bolenlerListesi.add(i);
           }

        }


        return bolenlerListesi;




    }
}

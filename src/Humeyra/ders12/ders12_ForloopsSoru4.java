package Humeyra.ders12;

import java.util.Scanner;

public class ders12_ForloopsSoru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir baslangic degeri giriniz.");
        int baslangic= scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int bitis=scan.nextInt();
        int toplam=0;

        if(baslangic<bitis){
            for (int i = baslangic; i <=bitis; i++) {

                toplam+=i;

            }
            System.out.println(toplam);}
        else if(bitis<=baslangic){

            for (int i = bitis; i <=baslangic; i++) {
                toplam+=i;
            }
            System.out.println(toplam);
        }


    }
}

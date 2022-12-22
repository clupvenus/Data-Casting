package Humeyra.ders16;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSoru5 {
/*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.
         */
public static void main(String[] args) {


        System.out.println(Arrays.toString(kendiArrayiniYap()));
}
public static String[] kendiArrayiniYap(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Lutfen arrayinizin boyutunu giriniz");
    int arrLengt= sc.nextInt();
    sc.nextLine();
    System.out.println("Lutfen arrayinizin elementlerini giriniz");
    String[]kullaniciArrayi=new String[arrLengt];
    for (int i = 0; i < arrLengt; i++) {
        String element=sc.nextLine();
        kullaniciArrayi[i]=element;
    }
    return kullaniciArrayi;
}







}
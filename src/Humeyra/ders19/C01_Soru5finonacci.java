package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Soru5finonacci {
    public static void main(String[] args) {
        //kullanicidan kac tane fibonacci sorusu yazmamizi istedigini sor ve istedigi kadar fibonacci sayisi yazdir.
        //0 1 1 2 3 5 8 13 21 34 55
        System.out.println(fibonacciListesiOlustur());

    }
    public static List<Integer> fibonacciListesiOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kac tane fibonacci sayisi yazdirmak istediginizi giriniz.");
        int count= scan.nextInt();
        List<Integer> fibonaccilist=new ArrayList<>();
        if (count<1){ System.out.println("Gecersiz sayi girdiniz.");
        return null;}
        //burada return olarak birsey yazmasaydik hata verirdik. cunku her sekilde bir return type i olmak zorundaydi.
        else if(count==1){
            fibonaccilist.add(0);
            return fibonaccilist;
        } else if (count == 2) {
            fibonaccilist.add(0);
            fibonaccilist.add(1);
            return fibonaccilist;

        }else {//count>2
            int sayi1=0;
            int sayi2=1;
            int sayi3=sayi1+sayi2;
            fibonaccilist.add(sayi1);
            fibonaccilist.add(sayi2);

            do{
                fibonaccilist.add(sayi3);
                sayi1=sayi2;
                sayi2=sayi3;
                sayi3=sayi1+sayi2;

            }while(fibonaccilist.size()<count);
             return fibonaccilist;





        }

    }



}

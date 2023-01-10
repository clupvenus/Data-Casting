package Humeyra.ders30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(23);
        sayilar.add(2);
        sayilar.add(9);
        sayilar.add(11);
        System.out.println(sayilar);

        //index yapisi kullanmadan tum elementleri 3 artirin.

        for (int e:sayilar
             ) {
            System.out.println((e +=3)+" ");

        }

        System.out.println(sayilar);

        Iterator itr=sayilar.iterator();

        System.out.println(itr.next());//5
        //iteratorun hayali bir imleci var next methodu ile ilk bulunan variable in uzerinden geciyor.
        // ve bize ilk sayiyi yazdiriyor.
        //tekrar next dedigi,izde ikinciyi donecek ve boyle devam eder.
        //index yapisini kullanmadan tum elementleri yazdirin.Tek tek bu sekilde yazdirabiliriz.

        System.out.println(itr.next());//23
        System.out.println(itr.next());//2
        System.out.println(itr.next());//9
        System.out.println(itr.next());//11

        //tek tek yapmayip loop ile yapalim.
        System.out.println(itr.hasNext());//false
        // su an imlec en sona gitti.
        //iterator da geri donus yok ya yeniden iterartor olusturmaliyiz yada yeni deger atamaliyiz.

        itr=sayilar.iterator();
        //yeni deger atadik.
        System.out.println(itr.hasNext());//true


        while (itr.hasNext()){
            System.out.print(itr.next()+" ");

        }//5 23 2 9 11


        //iterator kullanarak listemdeki 5 ten buyuk sayilari silin.
        System.out.println("");

        itr=sayilar.iterator();

        while (itr.hasNext()){
       /*
        if(itr.next()>5) {
            System.out.println(itr.next()+" ");
            bunu kabul etmedi cunku bir taraf obje bir taraf integer
        }*/

            int sayi=(Integer) itr.next();
            if (sayi>5) itr.remove();


        }
        System.out.println(sayilar);//[5, 2]





    }
}

package Humeyra.ders32;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C03_HasSet_TreeSet {
    public static void main(String[] args) {
       //Bir hashset ve treeSet olsuturun icine 100000 sayi ekleyin
       //islem surelerini hesaplayin.


        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();


     int sayi=0;

     Long hassetbas=System.currentTimeMillis();
     while (sayi<100000){
         hashSet.add(sayi);
         sayi++;
     }
     Long hassetbit=System.currentTimeMillis();
  int sayi1=0;
     Long treebas=System.currentTimeMillis();
     while (sayi1<100000){
            treeSet.add(sayi1);
            sayi1++;
     }
     Long treebit=System.currentTimeMillis();


        System.out.println("HASh :"+(hassetbit-hassetbas));
        System.out.println("Tree: "+(treebit-treebas));







    }
}

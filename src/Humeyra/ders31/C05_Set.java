package Humeyra.ders31;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {
     //Set index yapisini desteklemez.

        Set<String> ogrenciler=new TreeSet<>();
        //tree set i secersek sirali olur
        //hash seti secersek hizli olur
        //cok ekleme cikarma yapacaksam Linked seti secerim.

        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");

        System.out.println(ogrenciler);//[Ayten, Esra, Furkan] natural ordera gore siraliyor.

        ogrenciler.add("Furkan");
        System.out.println(ogrenciler);//Eski furkani siler yeni 'furkani siler ama listede bir Furkan olur.
//[Ayten, Esra, Furkan]

    }
}

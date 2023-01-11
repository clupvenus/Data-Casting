package Humeyra.ders32;

import java.util.HashSet;
import java.util.Set;

public class C02_hashSet {

    public static void main(String[] args) {

        Set<String> set1=new HashSet<>();

           set1.add("Sevilay");
        set1.add(null);
        set1.add("Ramazan");
        set1.add("Elif");

        System.out.println(set1);//[null, Sevilay, Elif, Ramazan]
        set1.add(null);
        //bir kez daha eklesek de bir kez ekliyor.
        System.out.println(set1);//[null, Sevilay, Elif, Ramazan]




    }





}

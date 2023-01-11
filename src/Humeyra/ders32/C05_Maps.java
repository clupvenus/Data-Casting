package Humeyra.ders32;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {

    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");

        System.out.println(ogrenciMap);//{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF}
        System.out.println(ogrenciMap.size());//4
        System.out.println(ogrenciMap.containsKey(103));//true
        System.out.println(ogrenciMap.containsValue("Ali"));//false

        //sadece ali diye bir value yok.

        System.out.println(ogrenciMap.containsValue("Ayse-Can-10-H-MF"));//true


    }
}

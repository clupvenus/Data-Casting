package Humeyra.ders32;

import java.util.Map;

public class C06_Value {


    public static void main(String[] args) {



         /*
    yeni bir Map olusturuyoruz ama bos olarak degil.Bu sefer
     */

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        ogrenciMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Sevgi-Can-10-K-MF, 105=Sevgi-Cem-11-H-TM, 110=Cemal-Han-12-M-MF}
        System.out.println(ogrenciMap.keySet());
//[101, 102, 103, 104, 105, 110]
        System.out.println(ogrenciMap.values());
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Sevgi-Can-10-K-MF, Sevgi-Cem-11-H-TM, Cemal-Han-12-M-MF]


        //verilen ismin ogrenci map te olup olmadigini kontrol eden doenn bir method olusturun.

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");


        System.out.println(sonuc);//true


        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Kelam"));//false

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Sevgi"));//true


    }

















}

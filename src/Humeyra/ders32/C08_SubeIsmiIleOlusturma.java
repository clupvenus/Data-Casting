package Humeyra.ders32;

import java.util.Map;

public class C08_SubeIsmiIleOlusturma {
    public static void main(String[] args) {
      //verilen sinif ve sube ismi ile sinif listesini yazdirin.

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();


        MapMethodDepo.sinifListesiYazdirma(ogrenciMap,"11");
        //No isim soyisim bolum
        //=====================
        //101 Ali Can MF
        //103 Ali Cem TM
        //105 Sevgi Cem TM


    }
}

package Humeyra.ders32;

import java.util.Map;

public class C07_SoyIsimIleAra {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        MapMethodDepo.soyisimIleOgrenciListesiYazdirma(ogrenciMap,"Can");
      /*  Ali  Can  11  H
         Sevgi  Can  10  K
*/
    }
}

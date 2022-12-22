package Humeyra.ders19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Collection {
    public static void main(String[] args) {
        //bir listedeki elementleri siralamak icin kullaniriz.
        List<String> isimler=new ArrayList<>();
        isimler.add("Azra");
        isimler.add("Humeyra");
        isimler.add("Berna");
        isimler.add("Zeynep");
        isimler.add("Tayfun");
        Collections.sort(isimler);
        System.out.println(isimler);
        //[Azra, Berna, Humeyra, Tayfun, Zeynep]
        //kucuk harfler once kullanilir.

    }
}

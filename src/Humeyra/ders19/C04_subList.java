package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;

public class C04_subList {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Azra");
        isimler.add("Humeyra");
        isimler.add("Berna");
        isimler.add("Zeynep");
        isimler.add("Tayfun");
        System.out.println(isimler.subList(1,3));
        //[Humeyra, Berna]
    }
}

package Humeyra.ders19;

import java.util.ArrayList;
import java.util.List;

public class C06_ListiArrayeCevirme {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Azra");
        isimler.add("Humeyra");
        isimler.add("Berna");
        isimler.add("Zeynep");
        isimler.add("Tayfun");
        String[] arr=isimler.toArray(new String[0]);
        //icine new String[0] yazmadan acalismaz.Zaten kendisi otomatik cikiyor.
        //yA DA new Integer[0] yazabiliriz.

    }
}

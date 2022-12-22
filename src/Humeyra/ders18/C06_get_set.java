package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        //2. indekse f ekleyin
        harfler.add(2,"F");
        System.out.println(harfler);
        //[A, B, F, K]
        //add methodu silmeden istedigimiz elemnti ekler kalanlari saga kaydirir.
        harfler.set(2,"M");
        System.out.println(harfler);
        //[A, B, M, K]
        //set te direk deger degistirir
        System.out.println(harfler.get(1));//B
        //get te indeksi giriyoruz ve direk sonuc veriliyor.


    }
}

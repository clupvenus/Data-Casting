package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C01ArrayList {
    public static void main(String[] args) {
        String[] arr={"a","b","c"};
        //t eklemek isin ne yapiyorduk

        List<String> harfler=new ArrayList<>();
        System.out.println(harfler);//[]
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);//
        harfler.add(1,"C");
        System.out.println(harfler);//[A, C, B, K]
        List<String> karakterler=new ArrayList<>();
        karakterler.add("#");
        karakterler.add("%");
        harfler.addAll(2,karakterler);
        System.out.println(harfler);//[A, C, #, %, B, K]
    }
}

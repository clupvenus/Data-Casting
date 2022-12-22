package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("Z");
        harfler.remove("Z");//bunu yazdirdak ture yazdirir.
        System.out.println(harfler.remove("Z"));//false yazdi cunku artik z kalmadigi icin z yi silemedim demek istiyor. ikinci islem yapmis oldu
        System.out.println(harfler);//[A, B]

        //burada silinen element doner.
        System.out.println( harfler.remove(0));//A
        System.out.println(harfler);//[B]
        List<String> yeniList=new ArrayList<>();
        yeniList.add("B");
        yeniList.add("C");
        yeniList.add("D");
        yeniList.add("T");
        System.out.println(yeniList.removeAll(harfler));//true gorevi yaptim
        System.out.println(yeniList);//[C, D, T]


    }
}

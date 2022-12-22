package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C08_Soru3 {
    public static void main(String[] args) {
//Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
//- Kelimenin uzunlugu cift sayi ise ilk yarisini
//- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
//yeni bir listeye ekleyip yazdirin.

        String[] arr={"Enes","Nazli","Seval","Abdullah","Naciye"};
        List<String> eklenilecek=new ArrayList<>();
        for (String each:arr
             ) {
            if(each.length()%2==0){
                System.out.println(each.substring(0,each.length()/2));
            }else{ System.out.println(each.substring(each.length()/2));
            }

        }
        System.out.print(eklenilecek);

    }
}

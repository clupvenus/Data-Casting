package Humeyra.ders22;

import java.util.ArrayList;
import java.util.List;

public class C01PassByValue {
    /*
    verilen list de degisiklik yapan 2 method olusturun
    1. method Listin elementlerine yeni dger atayip yazdirsin
    2. method, liste yeni bir list degeri atayip, yeni liste elementler ekleyip yazdirsin.
    her iki methodu cagirdiktan sonra main method daki List`ì yazdiralim.
     */

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(25);
        list.add(35);
        list.add(45);
        elemenDegistir(list);//  [29, 19, 39]

        System.out.println(list);//[29, 19, 39]
        yeniListOlustur(list);//[5, 6, 7]
        //bu methodda list tamamen degistigi icin listi yazdir dediginde degisen listi degil bizim ilk listimizi
        //yazdirir. cunku listin referansi degismistir.
        //bu sebeple java kendi bildigi ilk listin degerini yazdirir.
        System.out.println(list);//[29, 19, 39]


    }public static void elemenDegistir(List<Integer> list){

        list.set(0,29);
        list.set(1,19);
        list.set(2,39);
        System.out.println(list);




    }

    public static void yeniListOlustur(List<Integer> sayilar){
        sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        System.out.println(sayilar);
    }


}

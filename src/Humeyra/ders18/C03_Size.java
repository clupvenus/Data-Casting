package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C03_Size {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(1);
        System.out.println(sayilar.size());//5
        System.out.println(sayilar.isEmpty());//false
        sayilar.clear();//listenin elemanlarini siler
        System.out.println(sayilar);//[]
        System.out.println(sayilar.isEmpty());//true
        System.out.println(sayilar.contains(5));//false icerir icermez diye sonuc verir

    }
}

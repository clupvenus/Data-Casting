package Humeyra.ders18;

import java.util.ArrayList;
import java.util.List;

public class C07_equals {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(6);
        list1.add(7);
        List<Integer> list2=new ArrayList<>();
        list2.add(5);
        list2.add(7);
        list2.add(6);
        List<Integer> list3=new ArrayList<>();
        list3.add(5);
        list3.add(6);
        list3.add(7);
        System.out.println(list1.equals(list2));//false
        System.out.println(list1.equals(list3));//true


    }
}

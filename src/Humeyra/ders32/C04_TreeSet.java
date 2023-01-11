package Humeyra.ders32;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {
    public static void main(String[] args) {
        Set<Integer> sirali=new TreeSet<>();

        sirali.add(13);
        sirali.add(34);
        sirali.add(1);
        sirali.add(23);
        sirali.add(143);
        System.out.println(sirali);//[1, 13, 23, 34, 143]

    }
}

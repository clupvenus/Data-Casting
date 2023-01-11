package Humeyra.ders31;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {
    public static void main(String[] args) {
        //iki yonlu kuyruk demektir. ondan solayi genelde cogu methodda first ve Last diye bir ayrim var.


        Deque<String> harfler=new LinkedList<>();


        harfler.add("J");
        harfler.add("L");
        System.out.println(harfler);//[J,L] eger birsey demezsek sona ekleyerek gider.

        harfler.add("B");
        System.out.println(harfler);//[B,J,L]

        System.out.println(harfler.removeFirst());
        System.out.println(harfler);//[L, B]


        harfler.addFirst("A");
        harfler.addLast("K");
        harfler.add("A");
        System.out.println(harfler);//[A, L, B, K, A]

        harfler.remove("A");
        System.out.println(harfler);//[L, B, K, A]

        harfler.addFirst("A");

        harfler.removeFirstOccurrence("A");
        System.out.println(harfler);//[L, B, K, A]

        harfler.offer("A");
        System.out.println(harfler);//[L, B, K, A, A]

        System.out.println(harfler.peek());//L
        //ilk harfi bize dondurur ama silmez. Bossa da null doner.

        harfler.push("Z");


        System.out.println(harfler);//[Z, L, B, K, A, A]
        //Bir dequeu nun basina elemnet ekler.Kapasite sinirlamasina bakar.

        System.out.println(harfler.pop());//Z
        System.out.println(harfler);//[L, B, K, A, A]
        //Ilk elemneti siler ve biz o elementi dondurur.



    }
}

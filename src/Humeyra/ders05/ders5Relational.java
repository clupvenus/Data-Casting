package Humeyra.ders05;
import.java.lang.String;

public class ders5Relational {
    public static void main(String[] args) {
        int a= 10;
        int b=15;
        System.out.println(a==b);
        //== esitlik demektir. sonuc false ya da true olur.
        System.out.println(a==b-5);
        System.out.println(a!=b);
        //!= isareti esit degildir demektir.
        // sonuclar boolean olarak olur

        boolean c;
        System.out.println(c=15==b);
        // true
        c=15*a==10*b;
        System.out.println(c);
        c=15*a!=b*10;
        System.out.println(c);
        //false
    }
}

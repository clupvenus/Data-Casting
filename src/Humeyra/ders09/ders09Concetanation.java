package Humeyra.ders09;

public class ders09Concetanation {
    public static void main(String[] args) {
       //str.concetanation( baskaString );
        //Istedigimiz String’in sonuna baska bir String ekler
String a="Canim";
String b=" kizimi";
String c=" cok";
String d=" seviyorum.";
        System.out.println(a+b+c+d);
// boyle de yapabiliriz.
        //ikinci yontem .concat

        System.out.println(a.concat(b).concat(c).concat(d));
    }
}

package Humeyra.ders05;

public class ders5Logicaloperators2 {
    public static void main(String[] args) {
        //  Bu ifade || matematikteki mantikta veya anlamina gelir yani sadece ikisi de yanlisa o zman yanlis olur.
        //  diger durumlarda dogrudur.
        int a=10;
        int b=15;
        System.out.println(a>b ||b>0 );
        // biri dogru sonuc dogru
        System.out.println(a>=b-5 ||a>b-8);
        //ikiside dogru dogru
        boolean c;
        System.out.println(c=15>=b ||  a<0);
        c=a>b || 3*a<4*b;
        System.out.println(c);
        //true

    }
}

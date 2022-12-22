package Humeyra.ders05;

public class ders5LogicalOperators {
    public static void main(String[] args) {
    //&& operatoru mantiktaki ve operatorune denktir. her ikisi dogru is dogru diger durumlarda yanlistir.
        //& ifadesi de aynidir. tek fark & ifadesi butun sonuclari kontrol eder.
        // && ifadesi bir yanlis buluna gerisine bakmaz. Dolayisiyla daha hizlidir.
        int a=10;
        int b=15;
        System.out.println(a>b && b>0);
        //false
        System.out.println(a<=b-5 && a>b-8);
        // iki ifade de dogru sonuc dogru
        boolean c;
        System.out.println(c=15>=b && a<0);
        //c degeri false olacaktir. bir ifade yanlis
        c= a>=b && 3*a<4*b;
        System.out.println(c);
        //false



    }
}

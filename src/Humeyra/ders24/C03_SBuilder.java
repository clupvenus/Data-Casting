package Humeyra.ders24;

public class C03_SBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1==sb2);//false
        System.out.println(sb1.equals(sb2));//false
        //String Builder da equals methodu calismaz.
        //tamamen ayni olan sb yi karsilastirisaniz true verir.

        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.compareTo(sb2));//0
        StringBuilder sb3= new StringBuilder("Hava");
        System.out.println(sb1.compareTo(sb3));//2

        /*
        ikisi esitse o verir. Degilse ASCII tablosundan farki bulur.
        onu yazdirir.
        eger karakterler farkli ise karakter sayisinin farkini yazdirir.


         */
        //System.out.println(sb1==str);
        /*
        iki farkli data turu karsilastirilirsaCTE verir
        Compare to methodunda da ayni sekilde karsilastirma yapilamaz.
         */




    }
}

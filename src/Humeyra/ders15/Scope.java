package Humeyra.ders15;

public class Scope {
    static String hastaneIsmi;
    static String hastaneTeli;
    String perIsim;
    String perSoyisim="Soyisim belirtilmedi.";
    boolean izindeMi;
    int yas;

   // Kural 1 : Static veya instance variable’lara deger atama mecburiyeti yoktur.
    //Kural 2 : Static variable’lar, static olduklari icin tum class’dan direk kullanilabilirler
    //instance variable’lar static olmadiklari icin static method’lardan direk kullanilamazlar.
    //Instance variable’lara static method’lardan ulasmak ve/veya kullanmak icin obje olusturmamiz
    //gerekir.

    public static void main(String[] args) {
        System.out.println(hastaneIsmi);
        System.out.println(hastaneTeli);
        /*System.out.println(perIsim);
        java: non-static variable perIsim cannot be referenced from a static context
         */
        Scope per1=new Scope();
        System.out.println(per1.perIsim);//null
        System.out.println(per1.perSoyisim);//soyisim belirtilmedi
        System.out.println(per1.izindeMi);//false
        System.out.println(per1.yas);//0


    }//Instance variable’lari static olmayan method’lardan direk kullanabiliriz.

    public void method(){
        System.out.println(perIsim);
        System.out.println(perSoyisim);
        perIsim="k;lk;";

    }
}

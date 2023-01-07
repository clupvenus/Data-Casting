package Humeyra.ders27;

public class AGp {


    protected void method1(){
        System.out.println("GP method1");

    }
    protected void method2(){
        System.out.println("GP method2");

    }

}


//Tekrari izledim.
/*
Kurallar
1- static private ve final methodlar override edilemez.
 */


//overriding konusuda hatirlatma
// methodlari ararken ilk once kendi scope umuzua bakiyoruz.
    /*
    eger bir obje olusturuken constructerini baska bir class dan data type ini baska class dan aldiysak
    methodlara bakarken overring uygulmasini yapiyoruz.
    once kendi clasimiza sonra da parent clasimiza bakiyoruz.
    sonra buldugumuz methoda direk atlamiyoruz.
    ondan daha guncel yani child class larda yeniden guncellenmis override edilmis method varsa
    onu aliyoruz.
    ama childe da olan methodu direk almiyoruz.Aramak icin Childa gidemiyoruz. Child da sadece guncel olan
    var mi diye bakiyoruz.


     */
package Humeyra.ders23;

public class C08_SoruVarargs {
    public static void main(String[] args) {
        /*
        verilen sayilardan ilki haric digerlerini toplayip ilk sasyi ile carpan bir method olusturun.

        input:3 ,4,5,6,
        output:3*(4+5+6)=45
         */
        islemYap(3,4,5,6);
        islemYap(4);//0
        islemYap(3,4,5,6,8,1,2);//60

        //Sonuc :45

    }

    private static void islemYap(int a , int... sayilar) {
        int top=0;
        for (int each:sayilar
             ) {top+=each;

        }
        int sonuc=a*top;
        System.out.println("Sonuc :"+sonuc);
    }
}

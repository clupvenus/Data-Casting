package Humeyra.ders23;

public class C06_Varargs {
    public static void main(String[] args) {
        //oyle bir ethod olusturalim ki istedigimiz kadar variable yazalim
        topla (5,6);
        topla(5,6,7,8,9);
        /*
        Varargs array altyapisini kullanir. 
        istedigimiz kadar integer yazabiliriz.
         */

    }

    private static void topla(int... sayilar) {
        int top1=0;
        for (int i = 0; i < sayilar.length; i++) {
            top1+=sayilar[i];
            
            
        }
        System.out.println(top1);
        //foreachle yapalim
        int top2=0;
        for (int each:sayilar) {
            top2+=each;
        }
        System.out.println(top2);
        
    }
}

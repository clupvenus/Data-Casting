package Humeyra.ders23;

public class C05_Varargs {
    public static void main(String[] args) {
        //Verilen 2 sayiyi toplayi yazdiran bir method olusturunuz.
        topla(3,5);//Iki sayinin toplami :8
        topla(5,7,8);//Uc sayinin toplami : 20


    }

    private static void topla(int i, int i1, int i2) {
        System.out.println("Uc sayinin toplami : "+(i+i1+i2));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("Iki sayinin toplami :"+(sayi1+sayi2));
    }
}

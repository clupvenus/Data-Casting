package Humeyra.ders14;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(carpim(2.5,2.9));//7.25 double double
        System.out.println(carpim(5,5));//25 int int
        System.out.println(carpim(5,8.2));//int double
        //en dar hangisi ise onu kullanir
        System.out.println(carpim(5.2,5));//burda double double kullanir. cunku double int diye bir method yoktu

    }
    public static double carpim(double sayi1,double sayi2){
        return sayi1*sayi2;
    }
    public static int carpim(int sayi1, int sayi2){
        return sayi1*sayi2;
    }
    public static double carpim(int sayi1, double sayi2){
        return sayi1*sayi1;
    }
}

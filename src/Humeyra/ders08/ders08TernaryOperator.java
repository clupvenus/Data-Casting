package Humeyra.ders08;

public class ders08TernaryOperator {
    public static void main(String[] args) {
        //Ternary, if-else statements ile yapabilecegimiz basit islemleri, daha basit bir formda
        //kodlama imkani verir.
        int a=56;
        if (a>0){a*=2;}else {a+=10;}
        System.out.println(a);
        System.out.println("===");
        //ternary ile cozelim.
        //Ternary,sadece deger dondurdugu icin, ya yazdirmali veya bir variable’a atamalisiniz.
        int b=56;
        System.out.println(b>0 ? b*2 : b+10);




    }
}

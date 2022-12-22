package Humeyra.ders08;

public class ders08TernaryOrnek {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a>0? "sayi pozitif":"sayi pozitif degil");
        //sayi pozitif
        System.out.println(a>20? a*a : a++);
        //a=10 yazdirir ama a nin yeni degeri 11 olur.
        System.out.println(a<100 || a<0 ? 3*a+1 :2+a/5);
        //a=34
        int x=10;
        int y=15;
        int z= a>0 ? y++:--x;
        //x=10 y=16 z=15
        System.out.println(x+" "+y+" "+z);
    }
}

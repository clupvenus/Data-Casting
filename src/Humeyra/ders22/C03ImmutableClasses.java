package Humeyra.ders22;

public class C03ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";
        str.replace('J','k');
        System.out.println(str);//Java
        //degisiklik olmadi
        str=str.replace('J','k');
        System.out.println(str);
        //kava
        //atama yapinca degisti.AMa aslinda degismedi.
        //sadece obje degisir ama referansi degismez eski pointer silinir yeni bir obje olusturur ve pointer yeni objeyi
        // isaret eder. eski obje de garbage collector bir ara gelir toplar. eski obje yerinde durur ama hicbir deger onu pointer etmez..
        //asagidaki kod calisirsa kac tane obje olusur?
        String a="ABC";
        for (int i = 0; i < 10; i++) {
            a=a+i;

        }
        System.out.println(a);//ABC0123456789
        //toplam 11 tane obje olustu.
    }
}

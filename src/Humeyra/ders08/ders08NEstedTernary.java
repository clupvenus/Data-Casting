package Humeyra.ders08;

public class ders08NEstedTernary {
    public static void main(String[] args) {
        // konsolda ne yazacagini bulun.
        int a=10;
        int b=20;
        System.out.println(a>5?a>0?100:50:a<20?a+5:a-5);
        //a 5 ten buyuk olduguna gore ilk kisim calisacak simdi ilk kisimi inceleyecegiz
        //a yine 0 dan buyuk dolayisiyla ilk kisim calisacak yani 100
        System.out.println(b<a? b>0?b+a:b-a:a<0?a*5:b/a);
        //b a dan buyuk olduguna gore ikinci kisim calisak tam ortadaki ikinoktanin sagi calisir
        //a<0 yanlis ikinci kisim calisacak yani b/a=2
        System.out.println(a==b? a>b?a:b:a<b?a+b:a-b);
        //a be ye esit degil ilk sart yanlis o zaman ikici bolume bakiyoruz
        //a<b mi? evet o zaman birinci kisim a+b=30

    }
}

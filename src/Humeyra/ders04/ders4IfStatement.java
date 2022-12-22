package Humeyra.ders04;

public class ders4IfStatement {
    public static void main(String[] args) {
    int a=10;
    int b=20;
    if(a>b){
        System.out.println("a b`den buyuk.");
    }
    //Basit if cumlelerine sart calisirsa body calisir sart calismazsa
        // body calismaz.
        if(a<100){
            System.out.println("a 100 den kucuk.");
        }
        if(b>0){
            System.out.println("b 0`dan buyuk");
        }

        boolean sonuc=a>b;
        if(sonuc){
            System.out.println("a b`den buyuk.");
        }
        sonuc=a<100;
        if(sonuc){
            System.out.println("a 100`den kucuk");
        }
    }
}

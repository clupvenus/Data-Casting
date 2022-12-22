package Humeyra.ders08;

import java.util.Scanner;

public class ders08SwitchStatement {
    public static void main(String[] args) {
        // if else kodlarinda bazen elseif cok oluyor. bu durumda kodu yazmak ve okumak zor oluyor. bunun yerine switch kullaniyoruz.
        //kullanicinin rakam olarak girdigi deger karsilik gelen gun no sunu yazalim
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun numarasi yaziniz.");
        int rakam =scan.nextInt();
        switch(rakam){
            case 1 : System.out.println("Pazartesi");
                break;
            case 2 : System.out.println("Sali");
                break;
            case 3 : System.out.println("Carsamba");
                break;
            case 4 : System.out.println("Persembe");
                break;
            case 5 : System.out.println("Cuma");
                break;
            case 6 : System.out.println("Cumartesi");
                break;
            case 7 : System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatali gun sayisi");

        }
    }
}

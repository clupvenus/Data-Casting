package Humeyra.ders06;

import java.util.Scanner;

public class ders06IfElseSoru1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen uc tane kenar uzunlugu giriniz");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0) System.out.println("Eskenar ucgendir");
        else System.out.println("Eskenar ucgen degildir.");
    }
}

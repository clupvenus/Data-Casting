package Humeyra.ders28;

import java.util.Scanner;

public class C08_KontrolluException {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen  yasinizi giriniz.");
        int yas= scan.nextInt();
        if (yas<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
    }
}

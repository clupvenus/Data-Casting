package Humeyra.ders01;


import java.util.Scanner;

public class bolum1Soru6 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        int yariCap= scan.nextInt();
        System.out.println("Cemberin alani : "+(3.14*yariCap*yariCap)+
                "\nCemberin Cevresi : "+(2*3.14*yariCap));

    }
}

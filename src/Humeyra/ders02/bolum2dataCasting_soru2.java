package Humeyra.ders02;

import java.util.Scanner;

public class bolum2dataCasting_soru2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf yaziniz.");
      char girilenHarf =scan.next().charAt(0);
//next. da char olmadigindan string aliyoruz sonra charAt(0) seciyoruz ve ilk kelimenin ilk karakterini alir
        //0. index birinci karakter demektir.
        System.out.println((char)(girilenHarf+1)+" , "+
                (char)(girilenHarf+2)+","
                +(char)(girilenHarf+3))
        ;



    }
}

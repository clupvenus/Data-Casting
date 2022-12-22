package Humeyra.ders13;

public class MethodOlusturmaSoru3 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //sonuclarini donduren bir method olusturun.
        int sayi=37;
        if(asalSayiMi(15)==false) System.out.println("Asal sayi degildir");
        else if (asalSayiMi(sayi)==true) {
            System.out.println("Asal sayi");

        }
        ;


    }
    public static boolean asalSayiMi(int a) {
        boolean asalSayiMi=true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                asalSayiMi=false;

                break;
            }

        }
        return asalSayiMi;
    }
}

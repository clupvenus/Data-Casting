package Humeyra.ders08;

public class ders08TernarySoru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
harf olarak yazdirin, yoksa girilen harfi yazdirin
         */
        char harf='X';
        System.out.println((harf>='a' && harf<='z')? (char)(harf-32) : (char)harf);
    }
}

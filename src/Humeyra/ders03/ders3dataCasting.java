package Humeyra.ders03;

public class ders3dataCasting
{
    public static void main(String[] args) {
//kucuk data turu buyuge cevirmek kolay olur
        byte a=5;
        int b=a;
        double c=b;
//  Daha genis kapasiteye sahip bir data turundeki bir degeri, daha dar kapsamli bir
//variable’a atamak istedigimizde, Java bunu otomatik olarak yapmayacaktir.
// biz kendimiz neye donustureceksek onu paratezde yazacagiz
int a1=5;
byte b1 =(byte) a1;
// sonuclar data turunun kapasitesine gore olur
        int a2=555;
        byte b2=(byte)a2;
        System.out.println(b2);// dediimizde +128 ekadar gelip her defasinda -127den tekrar baslar ve kalani yazar.
        //yani 256 nin katlarini cikarir sonra siralar.
        //bu durumda sonuc 43 olacaktir.

        char harf='b';
        int sayi=100;
        System.out.println(harf+sayi);
        //198 cikacak cunku a nin ASCII tablosundaki degeri 98.
        char yeniHarf = (char)+(harf+5);
        System.out.println(yeniHarf);
        //sonuc g harfi cikti.





    }
}

package Humeyra.ders23;

public class C07_Varargs {
    public static void main(String[] args) {
        //Kac tane argument yazilirsa yazilsin argumentlerin en uzununu yazdiran bir method olusturun.
        //not: en uzun kelime olarak birden fazla kelime varsa ilk siradakini yazdirsin.


       enuzunuYazdir("Ilyas","Humeyra","Murat");//Humeyra

    }

    private static void enuzunuYazdir(String... kelime) {
        String enUzun=kelime[0];
        for (String eachKelime: kelime
             ) {
            if(eachKelime.length()>enUzun.length())
                //burada esittir yazarsak en son uzun kelimeyi yazar. cunku ayni boyda bir kelime
                //geldginde onu yazdirir. ama esittir koymazsak ilkini yazar daha uzun bulamadikca
                //ilki aynen kalir.
                //soruda ilkini yazdir demistik
                enUzun=eachKelime;


        }
        System.out.println("en uzun kelime :"+enUzun);

    }
}

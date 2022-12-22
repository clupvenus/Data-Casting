package Humeyra.ders12;

public class ders12ForloopsSoru11 {
    public static void main(String[] args) {
       //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //kontrol edin ve sonucu yazdirin.
        int input=15;
        String sonuc="Sayi asaldir";
        for (int i = 2; i <input ; i++) {

            if (input % i == 0){ sonuc = "Asal degildir.";
                break;}

        }
// Java bir loop un icerisinde "break" gorurse o lopu bitirir.
        System.out.println(sonuc);

    }
}


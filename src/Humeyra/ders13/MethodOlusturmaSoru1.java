package Humeyra.ders13;

public class MethodOlusturmaSoru1 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //mesaji verin
        //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        //yazdirin.
        String input="01234567890123456789";
        int bas=5;
        int bit=10;
        indexDonme(input,bas,bit);

    }
    public static void indexDonme(String str,int baslangicDeger,int bitisDeger) {
        if(baslangicDeger>bitisDeger){
            System.out.println("Htali giris");
        }else if(str.length()<baslangicDeger||str.length()<bitisDeger){
            System.out.println("kelimenizin uzunlugundan fazla sayi girdiniz.");
        }else{
            System.out.println(str.substring(baslangicDeger,bitisDeger));
        }



    }
}

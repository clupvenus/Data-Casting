package Humeyra.ders24;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        //Kapasitesi 16 olan bos bir StringBuilder olusturur.
        System.out.println(sb1.capacity());//16

        StringBuilder sb2=new StringBuilder(11);

        StringBuilder sb3=new StringBuilder("Java Candir.");
        System.out.println(sb3.capacity());//28

        sb2.append("Java");
        //SB add methodu bu sekilde
        System.out.println(sb2);
        System.out.println(sb2.capacity());//11
        // kapasiteyi gecmeden string eklersek kapasite degismez
        // ama kapasiteyi asinca yeni kapasite ekler
        //Son durumda kapasite*2+2 =11*2+2=24 olacak sekilde yeni bir kapasite olusur.
        sb2.append("kapasiteyi gec bakalim simdi ne olacak");
        System.out.println(sb2.capacity());//42 oldu
        sb2.append("birde bunu eklesek");
        System.out.println(sb2.capacity());//86
        //Bu kapasite de fazla geldiyse ve icindeki kadar kapasitem olmasini istiyorsam sb.trimToSize kullanalim.
        sb2.trimToSize();
        //Sb mutable oldugundan methodlarla yapilan degisiklikler kalici olur.
        System.out.println(sb2.capacity());//60
        System.out.println(sb2.length());//60

        //sb1 e bakalim
        sb1.append("kucuk birsey");


        sb1.trimToSize();
        System.out.println(sb1);
        System.out.println(sb1.length());//12
        System.out.println(sb1.capacity());// baslangicta bos bir SB yapmistik kapasitesi 16 idi simdi 12 ye dustu


    }

}

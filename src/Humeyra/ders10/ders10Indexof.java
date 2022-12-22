package Humeyra.ders10;

public class ders10Indexof {
    public static void main(String[] args) {
//Bir String icerisinde aradigimiz bir String
// veya char degerin ilk kullanim index’ini
//bulur.
//2 parametre kullanirsak aramaya hangi index’den
// baslayacagini da soyleyebiliriz
        String str="Java cok guzel,cok.";
        System.out.println(str.indexOf('a'));
//        buldugu ilk a nin indeksini verir. 1
        System.out.println(str.indexOf('a',1));
       // 1 den sonraki ilk indeksi arar.
        System.out.println(str.indexOf('c',7));
        //15
        System.out.println(str.length());
        //19
        System.out.println(str.indexOf("cok"));
        //5 nci indeksten baslar.
        System.out.println(str.indexOf("cok",6));
        //15
        System.out.println(str.indexOf("humeyra"));
        //icermiyorsa -1 olur.
    }
}

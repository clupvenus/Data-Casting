package Humeyra.ders10;

public class ders10LastIndex {
    public static void main(String[] args) {
//        Aranan String veya char’in verilen metindeki en son kullanimini bulur ve index’ini
//döndürür.
        String str="Java cok guzel cok";
        System.out.println(str.lastIndexOf("cok")); //15
        System.out.println(str.indexOf("cok"));//5
        System.out.println(str.lastIndexOf('o'));//16
        System.out.println(str.indexOf('o'));//6
        //Her iki kullanimda da arananString/char’i bulamazsa -1 döndürür.

    }
}

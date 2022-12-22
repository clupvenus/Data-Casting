package Humeyra.ders11;

public class StringSoru3 {
    public static void main(String[] args) {
        //Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.
        String str= "java1 ogRe2@nMek3 #ne +Gu=zel ";
        str=str.replaceAll("\\d","");
        str=str.replaceAll(" ","5");
        str=str.replaceAll("\\W","");
        str=str.replaceAll("5", " ");
        str=str.toLowerCase();
        str=str.replace(str.substring(0,1),str.substring(0,1).toUpperCase());
        System.out.println(str);


    }
}

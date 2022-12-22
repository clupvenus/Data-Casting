package Humeyra.ders11;

public class ders11StrTrim {
    public static void main(String[] args) {
        //Bir String’in basinda ve sonunda (varsa) bulunan space’leri siler
        String str=" ali   ayseyi  seviyor.     ";
        System.out.println(str.trim());
        //ali   ayseyi  seviyor.
        // sadece basini ve sonunu siliyor ortadaki bosluklara dokunmuyor.

    }
}

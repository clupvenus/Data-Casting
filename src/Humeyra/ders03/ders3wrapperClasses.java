package Humeyra.ders03;

public class ders3wrapperClasses {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        int a=35;
        int b=456;
        System.out.println(Integer.max(a,b));

        //Wrapper Classes`larda bir cok farkli method uygulanabilir.


        char karekP='a';
        Character karekW='b';
        System.out.println(Character.isDigit(karekW));
        System.out.println(Character.isLowerCase(karekW));

        String str2="1234";
        String str3="1000";
        System.out.println(str2+str3);//12341000 yanyana yazdirir.
        System.out.println(Integer.valueOf(str2)+Integer.valueOf(str3));
        // boylece iki degeri topladi ve 2234 oldu.

        boolean kontrol=true;
        Boolean kont=false;
        String knt="false";
        boolean sonuc=Boolean.valueOf(knt);
        System.out.println(sonuc);
        //burada da String degerini boolean a cevirdi.


    }
}

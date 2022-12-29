package Humeyra.ders24;


public class C02_sBMethodlari {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");

        sb.toString().toUpperCase();
        //String builderi stringe cevirirseniz yada string dondurecek methodlari
        // kullanirsaniz, string ozelligi gosterir mutable olmaz.
        //yapilan degisiklikler kalici olmaz.
        //kalici yapmak icin yeni bir SB apip ona atyabilisiriz.
        StringBuilder sb2=new StringBuilder( sb.toString().toUpperCase());
        System.out.println(sb2);//JAVA
        sb=sb2;

        sb2.setCharAt(0,'H');//HAVA
        System.out.println(sb);
        System.out.println(sb.substring(2,3));//V
        sb.reverse();
        System.out.println(sb);//AVAH

        sb.insert(1,"Y ");
        System.out.println(sb);//AY VAH

        String uzunMetin="ETMEK YOK CALISMAK VAR";
        sb.insert(6,uzunMetin,0,10);
        System.out.println(sb);//AY VAHETMEK YOK

        System.out.println(sb.indexOf("A", 3));//4
        System.out.println(sb.indexOf("VAH"));//3
        System.out.println(sb.lastIndexOf("VAH"));//3
        System.out.println(sb.lastIndexOf("E",9));//9

        sb.replace(0,12,"Sorun");
        System.out.println(sb);//SorunYOK

        sb.delete(5,sb.length()) ; //  baslangic dahil bitis indexi dahil degil;
        System.out.println(sb);//Sorun



    }
}

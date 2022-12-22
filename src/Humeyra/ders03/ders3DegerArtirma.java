package Humeyra.ders03;

public class ders3DegerArtirma {
    public static void main(String[] args) {
        int sayi=10;
        sayi= sayi+3;
        System.out.println(sayi);//13
        sayi*=3;
        System.out.println(sayi);//39
        sayi++;
        System.out.println(sayi);//40
        sayi+=5;
        System.out.println(sayi);//45
        sayi=sayi-2;
        sayi-=4;
        sayi--;
        ++sayi;
        --sayi;
        //sayi++ ve ++sayi arasindaki fark oncelik sirasiyla ilgilidir.

        int a=5;
        int b=a++;// burada b ye once a atandigi icin b=5 a=6 oluyor.
        int c=++a;// burada ise once a artiriliyor sonra c ile esit oluyor. a=7 c=7
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        int x=10;
        System.out.println("x`in degeri "+ ++x);
        //11
        int y=x++;
        System.out.println("y`nin degeri "+ y);
        //y= 11 x=12
        int z=y++ +x;
        System.out.println("z`nin degeri "+ z);
        //z=23 y=12 x=12
        System.out.println("Toplam deger "+(x+y+z));






    }
}

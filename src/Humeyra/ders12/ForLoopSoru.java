package Humeyra.ders12;

public class ForLoopSoru {
    public static void main(String[] args) {
        //kullanicidan bir char alip o karakterden sonra gelen 10 karakteri yazdirin.
        char karakter='a';
        for (int i = 1; i <=10; i++) {
            System.out.print((char)(karakter+i)+" ");

        }
    }
}

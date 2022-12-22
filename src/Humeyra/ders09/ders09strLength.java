package Humeyra.ders09;

import org.w3c.dom.ls.LSOutput;

public class ders09strLength {
    public static void main(String[] args) {
        //str.length bize karakter sayisini verir
        String str="hayat bizimdir bugun guzeldir.";

        System.out.println(str.length());//30

        // son index str.length-1 olacaktir.
//2: Her hangi bir karakter istenirken index sayisi degil, sondan kacinci harf
//oldugu veriliyorsa ( length – sondanKacinciKarakter ) index olarak
//kullanilabilir.
//Ornegin sondan 3.karakter isteniyorsa

        System.out.println(str.charAt(str.length()-3));



    }

}

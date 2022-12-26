package Humeyra.ders22;

import java.util.Arrays;

public class C02_Immutable {
    public static void main(String[] args) {
        //String mutable oldugu icin methodlarla kalici degisiklik olmaz.
        String str="Java";
        System.out.println(str.toUpperCase());//JAVA
        System.out.println(str);//Java
        //methodlarla kalici degisiklik olmadi.
        //atama yapmazsak kalici degisiklik olmaz
        //Arrayler immutable oldugu icin onlarda yapilan degisiklik kalicidir.
        str.toLowerCase();
        System.out.println(str);//Java
        //yine ayni kaldi.



        int[] arr={2,8,5,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //[2, 5, 6, 8] degisiklik kalici oldu halbuki atama yapmadik

    }
}

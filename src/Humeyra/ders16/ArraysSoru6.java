package Humeyra.ders16;

import java.util.Arrays;

public class ArraysSoru6 {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.

        String[] str={"ali","humeyra","fatih","azra","serra"};
        String enUzun=str[0];
        String enKisa=str[0];

        for (String each:str
             ) {
            if(each.length()>enUzun.length()){
                enUzun=each;
            }
            if (each.length()<enKisa.length()){
                enKisa=each;
            }

        }
        System.out.println("en uzun :"+enUzun+" en kisa :"+enKisa);


    }

}

package Humeyra.ders17;

import java.util.Arrays;

public class c01sort {
    public static void main(String[] args) {
        //verilen bir Arrayi NAturelOrdera gore siralayip yazdirin.
        String[] isimler={"Huseyin","Yusuf","Mehmet","Akile","Said","ahmet","adnan"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Akile, Huseyin, Mehmet, Said, Yusuf]
        //[Akile, Huseyin, Mehmet, Said, Yusuf, adnan, ahmet]
        //eger buyukten kucuge siralamak istersek once sortla naturel order yapariz sonrada siralami ters ceviririz.


    }
}

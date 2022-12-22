package Humeyra.ders17;

import java.util.Arrays;

public class C02Split {
    public static void main(String[] args) {
        String str="Java her gecen gun guzellesiyor.";
        //str da kac kelime var. bosluklardan ayirinca bulabiliirz.
        String[] spaceSplit=str.split(" ") ;
        System.out.println(Arrays.toString(spaceSplit));//[Java, her, gecen, gun, guzellesiyor.]
        System.out.println("Verilen cumledeki kelime sayisi "+spaceSplit.length);
        //Verilen cumledeki kelime sayisi 5
        String[] Split=str.split("");
        System.out.println(Arrays.toString(Split));
        //[J, a, v, a,  , h, e, r,  , g, e, c, e, n,  , g, u, n,  , g, u, z, e, l, l, e, s, i, y, o, r, .]


    }
}

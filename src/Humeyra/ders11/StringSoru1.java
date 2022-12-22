package Humeyra.ders11;

import java.util.Scanner;

public class StringSoru1 {
    public static void main(String[] args) {
      //Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa "Hem ev lazim hem is""Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle yaz");
        String str= scan.nextLine();
        String str1=str.toLowerCase();
        System.out.println(str1);

        // butun cumleleri kucuk harfe donustursun ki karsilastirabilsin.



        if (str1.contains("is")&&str1.contains("ev")){System.out.println("Hem ev lazim hem is");}
        else if (str1.contains("ev")) System.out.println("home home sweet home");
        else if (str1.contains("is")) System.out.println("calismak guzeldir");
        else System.out.println("cok calisman lazim");
    }
}

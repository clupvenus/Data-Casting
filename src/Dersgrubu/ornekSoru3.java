package Dersgrubu;

import java.util.Scanner;

public class ornekSoru3 {
    public static void main(String[] args) {
        // 3- kullanici tamam diyene kadar konsola isim gondersin,ve bu kullanicinin gonderdigi isimleri
        //  aralarinda yildiz olacak sekilde yazdirin
        //  ama dikkat edin sonunda yildiz olmasin.Bu soruyu while ile mi for ile mi cozmeliyiz dusunelim.

        Scanner scan=new Scanner(System.in);
        String str="";
        String toplam="";

        while(!str.equalsIgnoreCase("tamam"));{

            System.out.println("Lutfen bir isim yaziniz.bitirmek icin tamam yaziniz.");
            str=scan.nextLine();
            toplam+=str+"*";

        }
        System.out.println(toplam.substring(0,toplam.length()-7));






    }
}

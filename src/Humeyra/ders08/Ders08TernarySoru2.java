package Humeyra.ders08;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Ders08TernarySoru2 {
    public static void main(String[] args) {
       /* Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini yaziniz");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3=scan.nextInt();
        System.out.println((k1==k2 && k2==k3 && k1>0)? "eskenar ucgen":"Eskenar ucgen degil.");

    }
}

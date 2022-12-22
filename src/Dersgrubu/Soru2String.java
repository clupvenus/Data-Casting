package Dersgrubu;

public class Soru2String {
    public static void main(String[] args) {
        /*
        kullanicidan belirli bir formatta verdigi string fiyatlarini toplayip yazin
        input1 :15.30
        input:11.40 e
        output:26.70 e
                 */
        String s1="15.30 €";
        String s2="11.40 €";
        char ee=s1.charAt(s1.length()-1);
        s1=s1.replace(" €","");
        s2=s2.replace(" €","");
        double sayi1=Double.parseDouble(s1);
        double sayi2=Double.parseDouble(s2);
        System.out.println(sayi1+sayi2+" "+ee);



    }
}

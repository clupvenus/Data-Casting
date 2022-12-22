package Humeyra.ders11;

public class StringSoru2 {
    public static void main(String[] args) {
//Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
//input1 : “15.30 €” , input2 : “11.40 €”
//output : 26.70 €

        String input1="15.30 €";
        String input2="11.40 €";

        input1=input1.replace(" €","");
        input2=input2.replace(" €","");
        double input11=Double.parseDouble(input1);
        double input22=Double.parseDouble(input2);
        System.out.println("Toplam :"+input11+input22+" €");

    }
}

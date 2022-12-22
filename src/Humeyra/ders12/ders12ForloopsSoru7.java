package Humeyra.ders12;

public class ders12ForloopsSoru7 {
    public static void main(String[] args) {
        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        int input=411110005;
        int rakamlarToplami=0;

         while(input>0){
             rakamlarToplami+=(input%10);
             input/=10;
         }
        System.out.println(rakamlarToplami);
    }
}

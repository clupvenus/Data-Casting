package Humeyra.ders12;

public class ders12ForLoopsSoru9 {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        String str="ben humeyra.";
        String Terstr="";
        for (int i = str.length()-1; i >=0; i--) {
            Terstr+=str.charAt(i);

        }
        System.out.println(Terstr);
    }
}

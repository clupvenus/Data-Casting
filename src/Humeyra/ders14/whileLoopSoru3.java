package Humeyra.ders14;

public class whileLoopSoru3 {
    public static void main(String[] args) {
        //Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.
     String str="Java ogrenmek cok guzel";
     String tersStr="";
     int sayi=str.length()-1;


     while(sayi>=0){
         tersStr+=str.charAt(sayi);

         sayi--;
     }
        System.out.println(tersStr);

    }
}

package Humeyra.ders13;

public class MethodOlusturmaSoru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //bolenleri sayisini bulup bize donduren bir method olusturun.
        int sayi=81;
        System.out.println(pozitifBolenler(sayi));

    }
    public static int pozitifBolenler(int sayi){
        int flag=0;
        for (int i = 1; i <= sayi; i++) {
            if(sayi%i==0)
                flag++;
        }
        return flag;
    }

}

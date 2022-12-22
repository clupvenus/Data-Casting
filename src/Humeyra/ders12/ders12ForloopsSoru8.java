package Humeyra.ders12;

public class ders12ForloopsSoru8 {
    public static void main(String[] args) {
       //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //tamsayilari yazdirin, sira
        //- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //yazdirin
        int input=45;
        for (int i = 1; i <input ; i++) {
           if( i%15==0) System.out.print("fizzbuzz ");
            else if(i%5==0) System.out.print("buzz ");
           else if(i%3==0) System.out.print("fizz ");
            else System.out.print(i+" ");


        }
    }
}

package Humeyra.ders13;

public class NestedForLoopsCarpimTablosu {
    public static void main(String[] args) {
       // /*
        //        verilen inputa gore carpim tablosu olusturun.

         int input=4;
        //        1 2 3 4
        //        2 4 6 8
        //        3 6 9 12
        //        4 8 12 16

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <= input; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }

    }
}

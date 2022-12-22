package Humeyra.ders17;

public class C07_MDA {
    public static void main(String[] args) {
        //Verilen iki katliString bir arrayde istenen metni iceren
        //elementleri yazdiran bir method olusturun.

String[][] arr={{"Ali","Zafer"},{"Betul","Hasan","Huseyin"},{"Said"}};
MetniIcerenKelimeler(arr,"er");
MetniIcerenKelimeler(arr,"a");


    }

    public static void MetniIcerenKelimeler(String arr[][],String arananKelime){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains(arananKelime)) {
                    System.out.print(arr[i][j]+" ");
                }

            }


        }
        System.out.println("");
    }
}

package Humeyra.ders16;

import java.util.Arrays;

public class ArraysSoru7 {
    public static void main(String[] args) {
      //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

 String[] isimler={"Ali","Veli","Cem"};
 String eklenecekIsim="Kemal";
        System.out.println(Arrays.toString(ArrayeElementEkleme(isimler, eklenecekIsim)));


    }
public static String[] ArrayeElementEkleme(String[] eklenilecekArray, String eklenilecekIsim){
        String[] temp=new String[4];
    for (int i = 0; i <eklenilecekArray.length ; i++) {
        temp[i]=eklenilecekArray[i];


    }
    temp[temp.length-1]=eklenilecekIsim;
    eklenilecekArray=temp;

return eklenilecekArray;
}


}

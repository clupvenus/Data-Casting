package Humeyra.ders31;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekiTekrar {
    public static void main(String[] args) {
        //veriler bir arraydeki tekrar eden elementleri sadece bir kere yazarak arrayi kisaltalim.

        int [] arr={1,2,3,4,3,2,1,6,5,7,9,8,7,5,6,9,8,7,4,5,6};

        Set<Integer> benzersiz = new HashSet<>();

        //Arraydeki tum elementleri Sete ekleyelim.

        for (int each:arr
             ) {
            benzersiz.add(each);

        }
        System.out.println(benzersiz);//[1, 2, 3, 4, 5, 6, 7, 8, 9]


        //Seti simdi tekrar arrye atayalim.

        arr=new int[benzersiz.size()];// hepsi sifirrdan olusan
         int index=0;
        for (int each:benzersiz
             ) {arr[index]=each;
            index++;


        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5, 6, 7, 8, 9]


























    }
}

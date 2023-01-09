package Humeyra.ders28;

import java.util.Random;

public class C04_MultibleException {
    public static void main(String[] args) {
        //0 dan 10 a kadar rasgele bir sayi uretip
        //str ve arr deki o indekse sahip elementleri yazdiralim.

        String str="Java";
        int[] arr={1,56,45,12};
        Random rnd=new Random();
       int rasgele= rnd.nextInt(10);
        System.out.println(rasgele+" buldugumuz rasgele sayidir.");
//1. cozum 1 try 2 catch
       /* try {

            System.out.println(str.charAt(rasgele));
            System.out.println(arr[rasgele]);


        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of range");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of range ");

        }*/
        //2. cozum 2 try catch
     /*

            try {
                System.out.println(str.charAt(rasgele));
                System.out.println(arr[rasgele]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String index out of range");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range ");
        }
*/
        //3. cozum 1 try ve ikisini de kapsayan bir exception
        try {
            System.out.println(str.charAt(rasgele));
            System.out.println(arr[rasgele]);
        } catch (RuntimeException e) {
            System.out.println("String index out of range");
            System.out.println("Array index out of range ");

        }

    }
}

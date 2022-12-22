package Dersgrubu;

import java.util.Arrays;

public class OrnekSoruJava2 {
    public static void main(String[] args) {
        //. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
        //	        Ex:
        //	            sentence = "caT dog dogG cAt"
        //	            output:
        //	                true

        String str="caT dog dogG cAt ".toLowerCase();

        String cat="cat";
        String dog="dog";
        String[] aranan=str.split(" ");
        System.out.println(Arrays.toString(aranan));
        int countCat=0;
        int countDog=0;
        for (String each:aranan
        ) {
            if(each.contains(cat)){
                countCat++;
            }
            if (each.contains(dog)){
                countDog++;
            }

        }

        System.out.println(countCat+" "+countDog);
    }

    }


package Dersgrubu;

import java.util.Arrays;

public class OrnekSoruJava {
    public static void main(String[] args) {
        /*
        4. write a program that can return the frequency of the a word Java from the sentence
        Ex:
            sentence = "Java Java";
            output:
                2
            Hint: you need to create
         */
        String str="Java java";
        String ara="Java";
        String[] aranan=str.split(" ");
        System.out.println(Arrays.toString(aranan));
        int count=0;
        for (String each:aranan
             ) {
            if(each.equalsIgnoreCase(ara)){
                count++;
            }

        }
        System.out.println("kac kere bulunur? "+count);
    }
}

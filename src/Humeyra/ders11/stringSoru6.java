package Humeyra.ders11;

public class stringSoru6 {
    public static void main(String[] args) {
//Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
//:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
//yazdirin

        String str="sevilir";

        if(str.length()%2==0){
           str= str.substring(0,str.length()/2)+":)"+str.substring(str.length()/2);
            System.out.println(str);
        }else if(str.length()%2!=0){
            str=str.substring(0,(str.length()/2))+":("+str.substring(str.length()/2+1);
            System.out.println(str);
        }

    }
}

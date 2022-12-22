package Dersgrubu;

public class soru6 {
    public static void main(String[] args) {
      /*  Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin

       */
        String str="sivilay";
        if(str.length()%2==0){
            System.out.println(str.substring(0, str.length() / 2) + ":)" + str.substring(str.length() / 2));
        }else {
            System.out.println(str.substring(0, str.length() / 2)+":(" +str.substring(str.length()/2+1));

        }
        System.out.println(str.replaceFirst(str.substring(str.length()/2),":(")+str.substring(str.length()/2+1));
        // bu kod butun ayni char lari degistirir.
    }
}

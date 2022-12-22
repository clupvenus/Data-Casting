package Humeyra.ders19;

public class C07_foreach {
    public static void main(String[] args) {
       int[] arr={2,4,6,8,1} ;

       // 1- getirilecek variable data turu
        //2-getirilecek elemente verilen isim
        //3-nereden getirilicegi

        for (int each:arr) {
            System.out.println(each+" ");


        }
        //tum elementleri top
        int top=0;
        for (int each:arr
             ) {
            top+=each;

        }
        System.out.println("Sayilarin toplami: "+top);
        top=0;
        for (int each:arr
             ) {
            top+=(each*each);

        }
        System.out.println("Karelerin toplami: "+top);

    }
}

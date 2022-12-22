package Humeyra.ders04;

public class ders4Concatenation {
    public static void main(String[] args) {
        String a="Hello";
        String b="World";
        System.out.println(a+b);
        System.out.println(a+" "+b);

        String aa="Hello";
        int bb =2;
        int cc=3;
        System.out.println(aa+bb+cc); //Hello23 islemler soldan baslanarak yapildigi icin
        System.out.println(cc+bb+aa);//5Hello
        System.out.println(aa+(bb+cc));//Hello5
        System.out.println(aa+bb*cc);//Hello6
      // simdi asagidaki sekle ulasmak icin nasil yazacagimizi bulalim.
        //12 Java kolay
        //34Java kolay
        //Java34kolay
        //Java12kolay

        String s1="Java";
        String s2=" ";
        String s3="kolay";
        String s4="";
        int a1=3;
        int b1=4;
        System.out.println(a1*b1+s2+s1+s2+s3);
        System.out.println(a1+s4+b1+s1+s2+s3);
        System.out.println(s1+a1+s4+b1+s3);
        System.out.println(s1+a1*b1+s3);

    }
}

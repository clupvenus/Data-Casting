package Humeyra.ders22;

public class C03ImmutableClasses {
    public static void main(String[] args) {

        String str="Java";
        str.replace('J','k');
        System.out.println(str);//Java
        //degisiklik olmadi
        str=str.replace('J','k');
        System.out.println(str);
        //kava
        //atama yapinca degisti.AMa aslinda degismedi.
    }
}

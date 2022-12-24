package Dersgrubu.pac1;

public class C01 {
    public static void main(String[] args) {
   /*     2.  Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School
        Assume that the given number is 1 ~ 18*/

        byte yas=12;
        switch (yas){
            case 1 : case 2: case 3: case 4: case 5:
                System.out.println("Elementary school");
                break;
            case 6: case 7: case 8:
                System.out.println("Middle school");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("High school");
                break;
            case 13: case 14: case 15: case 16:
                System.out.println("College");
                break;
            case 17: case 18:
                System.out.println("Grad School");
                break;
            default:
                System.out.println("Lutfen gecerli bir yas giriniz");



        }

    }
}

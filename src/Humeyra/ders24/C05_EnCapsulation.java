package Humeyra.ders24;

public class C05_EnCapsulation {
    public static void main(String[] args) {
        EncapsuleClass obj1=new EncapsuleClass();
        obj1.setSatis(100);
        obj1.setSatis(200);
        obj1.setSatis(300);

        System.out.println(obj1.getTopSatis());

        obj1.setHalkaAcikSayi(100);
        System.out.println(obj1.getTopSatis());


    }
}

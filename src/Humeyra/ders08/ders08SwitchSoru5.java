package Humeyra.ders08;

public class ders08SwitchSoru5 {
    public static void main(String[] args) {
      /*  Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin*/

    int gun=4;
    switch (gun){
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            System.out.println("Hafta ici");
            break;
        case 6:
        case 7:
            System.out.println("Hafta sonu");
            break;
        default:
            System.out.println("Gecersiz sayi");


    }
    }
}

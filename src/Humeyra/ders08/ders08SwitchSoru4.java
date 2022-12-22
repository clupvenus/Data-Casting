package Humeyra.ders08;

public class ders08SwitchSoru4 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board
        char harf= 's';
        switch (harf){
            case 's':
            case 'S':
                System.out.println("Software");
                break;
            case 'i':
            case 'I':
                System.out.println("International");
                break;
            case 't':
            case 'T':
                System.out.println("Testing");
                break;
            case 'q':
            case 'Q':
                System.out.println("Qualification");
                break;
            case 'b':
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Gecersiz harf");
        }

    }
}

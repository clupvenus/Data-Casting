package Dersgrubu;

public class Okul {
    public Okul(int a) {
        System.out.println("Parent CLass cons.");
    }
    public Okul (){
        System.out.println("kjak");
    }
}
class Sinif extends Okul {
    public Sinif (int age){
        
        System.out.println("Child class parametreli cons.");
    }
    public Sinif(){
        this(11);
        System.out.println("child class parametresiz cons");
    }

    public static void main(String[] args) {
        Sinif sinif1=new Sinif();
    }
}

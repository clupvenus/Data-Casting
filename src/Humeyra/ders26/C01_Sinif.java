package Humeyra.ders26;

//1.29 a kadar tekrarini izledim.
class Okul{
    String okulIsmi="Yildiz";
    String telefon="12345679";
}

public class C01_Sinif extends Okul{
    String telefon="12555555";
    String sinif="11-F";

    C01_Sinif (String telefon){
        System.out.println(telefon);//"54785326"--> Scope a bakar
        System.out.println(this.telefon);//"12555555"--> Class a bakar
        System.out.println(super.telefon);//"12345679"--> PArenta bakar
        System.out.println(okulIsmi);//Yildiz
        System.out.println(this.okulIsmi);//yildiz
        System.out.println(super.okulIsmi);//yildiz

        System.out.println(sinif);//11-F
        System.out.println(this.sinif);//11-F
        //System.out.println(super.sinif);//Javada parentta bulamadigini geri donup child a bakmaz.
        //Parent class da "sinif" olmadigindan CTE verir.

    }

    public static void main(String[] args) {
        C01_Sinif obj=new C01_Sinif("54785326");
    }

}

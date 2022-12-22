package Humeyra.ders20;

public class Car {
    /*
    bir classdan olusturulabilecek bir objelerin ozelliklerini variable ya da methodlardan olusturabiliriz.
     */
    String marka="Marka belirtilmemis.";
    String model="Model belirtilmemis.";
//simdi bir constructor yapalim. her yerde kullanilmasi icin public olsun.
    //ismi class ismiyle ayni olmak zorunda
    //methodla arasindaki en buyuk fark return typi olmamasi.
    public Car(){

    }

    public Car(String mrk,String mdl,int yl,int kmetre,String rnk){
        //bunu yapinca 1 related problem yazdi. cunku biz c01 clasinda  daha onceden default constructor
        //kullanarak bir obje yapmistik.onun icin bir tane de parametresiz bir constructor yapmaliyiz.
        //boylece problem cozulur.
        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

    }

    public Car(String marka, String model, String renk) {
        this.marka=marka;
        this.model=model;
        this.renk=renk;
        //
    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n model='" + model + '\'' +
                "\nyil=" + yil +
                "\nkm=" + km +
                "\nrenk='" + renk + '\'' +
                '}';
    }

    int yil=1900;
    int km;
    String renk="Renk secilmedi.";



    public static void hareket(){
        System.out.println("Tum arabalar hareket eder.");
    }



}

package Humeyra.ders20;

public class C01_Constructor {


  @Override
  public String toString() {
    return "C01_Constructor{}";
  }

  public static void main(String[] args) {

      Car car1=new Car();


        System.out.println(car1);//Humeyra.ders20.Car@27f674d
        //Car methodunda genarte yapip to string methodu olusturduk.
        //boylece instanse verileri yazzabiliyoruz.
       // Car{marka='Marka belirtilmemis.', model='Model belirtilmemis.', yil=1900, km=0, renk='Renk secilmedi.'}
//Car{marka='Marka belirtilmemis.'
// model='Model belirtilmemis.'
//yil=1900
//km=0
//renk='Renk secilmedi.'}
        // yazim seklini de degistirebiliriz.
        car1.marka="Audi";
        car1.model="A4";
        car1.yil=2020;
        car1.km=5000;
        car1.renk="Siyah";
      //  System.out.println(car1);
        //Car{marka='Audi'
        // model='A4'
        //yil=2020
        //km=5000
        //renk='Siyah'}
        //istersek 3 parametreli olan bir constructor uretebiliriz.
        //istedigimiz parametreleri girip create constructor diyebiliriz.
        //su an elimizde 5 parametreli ve parametresiz constructorlarimiz var

        Car car2=new Car("Tofas","sahin","beyaz");
        //boylece 3 parametreli baska bir constructor oliusturduk. Method overSizing deki
      // gibi farkli parametrelerle farkli constructorlar uretebiliriz.
      //tabi constructorda parametre isimlerini degistirirsek daha kullanisli olur.
      //burada soyle bir problem cikar. eger markayi yine marka yaparsak scope konusundan hatirlayaagimiz gibi
      //parametre degerlerini  instance variable ile ayni yapinca bunu karistiriyor.
      //onun icin this. marka methodunu kullanrak bu sorunu cozecegiz.
      //Zaten biz Genarate ile yaparsak java da otomatik olarak this.marka seklinde variabla olusturdu.

       Car car3=new Car("BMW","5.20",2020,"beyaz");


       //bu da genarate ile yaptigimiz 4 parametreli constructor.


    System.out.println(car3);
//Car{marka='BMW'
// model='5.20'
//yil=2020
//km=0
//renk='beyaz'}


    }



}

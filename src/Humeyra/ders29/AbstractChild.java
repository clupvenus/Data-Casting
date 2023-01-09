package Humeyra.ders29;

public class AbstractChild extends Abstract{
//mecburen override ettik dolayisiyla classin adinin alti kirmizi cizildi uzerine tikladik
    //ve implement et uyasi gorduk
    //sonra otomatik override yapti.


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public void method3(){

  }

    @Override
    public void method() {

    }

    public static void main(String[] args) {
      //Abstract obj=new Abstract();
        //Abstract classlardan OBJE uretilenez,
        //constactur i vardir.
        AbstractChild obj1=new AbstractChild();
        obj1.method1();
        obj1.method2();
        obj1.method3();


        }
    }




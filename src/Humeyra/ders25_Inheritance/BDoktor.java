package Humeyra.ders25_Inheritance;

public class BDoktor extends Apersonel{
    /*
    doktor classi personelin child classi oldu. boylece onun ozellliklerini de aldi

     */
    public static void main(String[] args) {
        BDoktor dok1=new BDoktor();
        dok1.isim="Kemal";
        dok1.soyIsim="Bulut";
        System.out.println(dok1.isim+" ,"+dok1.soyIsim+","+dok1.telefon);
//Kemal ,Bulut,Telefon atanmadi


    }

    
    public void maas() {
        System.out.println("Doktor maasi :"+6000);
    }
}

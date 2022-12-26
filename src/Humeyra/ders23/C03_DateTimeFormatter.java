package Humeyra.ders23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-12-26T20:20:07.875894700
        //Sadece terihi 20/12/2022 olarak yazdiralim.

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(ldt.format(format1));//26/12/2023
        // SAdece Tarihi 12.20.22 TUE seklinde yazdirsin istersek
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("MM.dd.YY EEE");
        System.out.println(ldt.format(format2));//12.26.23 Pzt
        //Sadece zamani 10:49 am olarak yazdir.
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(ldt.format(format3));//20:31 ÖS

                /*
                 format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini
         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami
         YY : yilin son iki rakamini
         YYYY : Yilin tamamini
         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati
         m : minute
         a yazarsak AM veya PM degerini yazar
                 */

    }
}

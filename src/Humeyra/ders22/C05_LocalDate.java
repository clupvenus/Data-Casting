package Humeyra.ders22;

import java.time.LocalDate;

public class C05_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);
        //2022-12-26
        System.out.println(tarih.getDayOfWeek());
//MONDAY
        System.out.println(tarih.getMonth());//DECEMBER
        System.out.println(tarih.getMonthValue());//12
        System.out.println(tarih.getDayOfMonth());//26
        System.out.println(tarih.withYear(2015));//2015-12-26
        System.out.println(tarih.withDayOfYear(15));//2022-01-15
        System.out.println(tarih.withYear(2000).withDayOfYear(125));//2000-05-04
        System.out.println(tarih.isLeapYear());//false
        System.out.println(tarih.minusWeeks(6));//2022-11-14
        System.out.println(tarih.minusWeeks(5).minusDays(15).minusYears(3));//2019-11-06
        System.out.println(tarih.plusMonths(7).plusDays(15).plusYears(2));//2025-08-10

        LocalDate tarih1=LocalDate.of(1975,10,13);
        LocalDate tarih2=LocalDate.of(1975,10,20);
        System.out.println(tarih1.isBefore(tarih2 )?"Tarih1 daha eski ":"Tarih2 daha eski");
        //Tarih1 daha eski
        System.out.println(tarih.hashCode());//4141850
        System.out.println(tarih1.hashCode());//4045453
        System.out.println(tarih2.minusDays(7).hashCode());//4045453
        //ayni gunlere ayni kodu verdi.


    }
}

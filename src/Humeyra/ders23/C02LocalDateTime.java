package Humeyra.ders23;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(ldt);
        //2022-12-26T22:15:50.943960900
        //turkey yazinca turkiyedeki saati soyler.
        ldt=LocalDateTime.now();
        System.out.println(ldt);//2022-12-26T20:16:45.353289400
        System.out.println(ldt.getDayOfWeek());//MONDAY
        System.out.println(ldt.withYear(2030));//2030-12-26T20:18:29.110768200
    }
}

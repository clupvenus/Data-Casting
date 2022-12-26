package Humeyra.ders23;

import java.time.LocalDate;
import java.time.Period;

public class C04_PEriode {
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1995,8,12);
    LocalDate bugun=LocalDate.now();
    Period yas=Period.between(dogumTarihi,bugun) ;
        System.out.println(yas);//P27Y4M14D
        System.out.println(yas.getYears());//27


    }
}

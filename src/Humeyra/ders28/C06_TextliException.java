package Humeyra.ders28;

import java.io.FileInputStream;
import java.io.IOException;

public class C06_TextliException {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\Gebruiker\\HUMEYRA\\src\\Humeyra\\ders28\\txt");
        int k=0;
        if((k=fis.read())!=(-1)) System.out.println((char) k);

        //bu soruda da . read kisminin alti cizili uzerine gelince tavsiye veriyor zaten.
        //bu sefer iki hatayi da kapsayan IO exception da kullanabiliriz yada ikisini de kullanacaksak once child olani kullanacagiz
    }
}

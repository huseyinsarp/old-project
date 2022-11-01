package tekrarCalismalari;

import java.util.stream.Stream;

public class T_08_StringClass_2 {
    public static void main(String[] args) {
        String diller = " İngilizce, fransızca, ispanyolca, türkçe ";
        System.out.println(diller.contains("arapça"));
        //Metinde aradığımız ifadenin geçip geçmediğini kontrol eder, boolean sonuç verir.
        System.out.println(diller.trim());
        // İlk ve son karakterde boşluk varsa ordan temizler.
        System.out.println(diller.charAt(20));
        //Metinde girdiğimiz sayıya denk gelen karakteri sonuç olarak verir.
        System.out.println(diller.replace("ispanyolca", "arapça"));

        String bilgi = "Ben javayı sevmiyorum";
        System.out.println(bilgi.replace("sevmiyorum", "seviyorum"));
        System.out.println(bilgi.replace("Ben", "Ahmet"));
        System.out.println(bilgi.replace(" ", "")); // istenmeyen karakterleri temizlemek için de kullanılır.

        String isim = "Ahmet";
        String isim2 = "Mehmet";
        System.out.println(isim.compareTo(isim2)); // Girilen değerlerde hangisi alfabede daha önce geliyorsa onu tespit eder. biraz anlamsız.










    }
}

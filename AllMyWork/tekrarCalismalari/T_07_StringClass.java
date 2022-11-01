package tekrarCalismalari;

import java.util.stream.Stream;

public class T_07_StringClass {
    public static void main(String[] args) {
        // concat  ve + ile String birleştirme
      /*  String isim = "Kerem";
        String soyisim = "Kartal"; //isim ve soyismi birlikte yazmamız gerektiği zamanlarda kullanacağımız 2 yöntem var
        String adSoyad = isim + soyisim; // + işareti ile 2 string ifadesini birleştiriyoruz.
        System.out.println(adSoyad);

        String bilgi = "Benim ismim: " + isim +  "Soyismim: " + soyisim;
        System.out.println(bilgi);

        String soyisimBilgi = "Soyadım: "  + soyisim;
        System.out.println(soyisimBilgi);

       */
        // *** Concat Metodu***
        String isim = "Kerem ";
        String soyisim = "Kartal";
        String adsoyad = isim.concat(soyisim);
        System.out.println(adsoyad);

        String isim2 = "Hüseyin ";
        String soyisim2 = "Sarp";
        String bosluk = " ";

        String adsoyad2 = isim2.concat(bosluk.concat(soyisim2)); //Birden fazla concat metodu ile birleştirme
        System.out.println(adsoyad2);
        // Genellikle daha pratik olması nedeniyle + ile birleştirme daha yaygın kullanılır.












    }

}

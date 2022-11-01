package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf();  -->>> List içinde istenen elemanın index değerini return eder.

        ArrayList<String> ListUlke = new ArrayList<>(List.of("Amerika", "Almanya", "İsveç",  "İngiltere"));
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));

        System.out.println(ListSehir.indexOf("Londra"));
        System.out.println(ListSehir.indexOf("Ankara")); // -1
        System.out.println(ListSehir.indexOf("Istanbul")); // -1  list'te olmayan eleman index'i -1 return eder.

        ListUlke.add("Amerika");
        System.out.println(ListUlke.indexOf("Amerika"));  // Tekrarlı elemanlarda solda ilk bulunan indexi return eder.

        System.out.println(ListUlke.lastIndexOf("Amerika"));  // Sağdan (sondan) ilk bulunan elemanın indexini return eder.




    }

}

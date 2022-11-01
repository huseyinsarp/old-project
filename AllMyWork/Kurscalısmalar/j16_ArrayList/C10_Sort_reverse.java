package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {
        //Collections.sort(list);  --->> verilen list'i naturel sıralama yapar.
        // Collections.reverse(list); --->>> verilen list'in ters sıralamasını return eder.

        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));

        System.out.println(ListSehir);
        Collections.sort(ListSehir);
        System.out.println(ListSehir);  // A'dan Z'ye sıralama   ascii değerine göre

        Collections.reverse(ListSehir);
        System.out.println(ListSehir);  // Z'den A'ya sıralama   ascii değerine göre

        ArrayList<String> ListUlke = new ArrayList<>(List.of("Amerika", "Almanya", "isveç",  "İngiltere"));
        Collections.reverse(ListUlke);
        System.out.println(ListUlke);

    }
}

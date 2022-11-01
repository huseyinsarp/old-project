package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> ListUlke = new ArrayList<>(List.of("Amerika", "Almanya", "İsveç",  "İngiltere"));
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));

        //nCopies(int.Obj);  -->> int elemanlı
        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7,"javaCAN"));
        System.out.println(yeniList);

        //addAll ();  -->> bir list'e diğer listi olduğu gibi ekler
        ListUlke.addAll(ListSehir);  // ulkeList'in sonuna sehirList tamamen eklendi.
        System.out.println(ListUlke);

        ListSehir.addAll(3, ListUlke); // 3.indexten itibaren ülke listi şehir listine tamamen eklendi.
        System.out.println(ListSehir);

        // 1'den 10'a kadar sayıları bir list'e atayıp print eden code create ediniz.
        ArrayList<Integer> sayi = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            sayi.add(i);
        }
        System.out.println(sayi);


    }
}

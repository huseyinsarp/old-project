package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));
        System.out.println(ListSehir.remove("Istanbul")); //false
        System.out.println(ListSehir.remove("Londra")); // true
        System.out.println(ListSehir.remove(1));  // Münih

        System.out.println(ListSehir); // elimizde kalanlardan [LosAngeles, Stockholm] verir.

        ListSehir.add("Münih");
        ListSehir.add("Ankara");
        ListSehir.add("Münih");
        System.out.println(ListSehir);

        ListSehir.remove("Münih");  // tekrarlı elemanlarda ilk index elemanını siler diğerlerini silmez.
        System.out.println(ListSehir);


    }
}

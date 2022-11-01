package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        //contains();  -->>> method List'te istenen elemanın varlğını kontrol eder. Sonucu boolean return eder.
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));
        System.out.println(ListSehir.contains("Istanbul"));
        System.out.println(ListSehir.contains("Münih"));


    }

}

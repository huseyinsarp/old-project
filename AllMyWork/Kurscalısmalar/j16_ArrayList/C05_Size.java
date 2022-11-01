package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Size {
    public static void main(String[] args) {

        // size();  -->> List'in eleman sayısını return eder.
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));
        System.out.println(ListSehir.size());  // 4
    }

}

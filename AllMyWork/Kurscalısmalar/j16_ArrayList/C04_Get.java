package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        // get();  -->> List'te istenen elemanı return eder.    arr[3] --->> arr'in 3.indexteki elemanını ver.
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));
        System.out.println(ListSehir.get(1));
       //  System.out.println(ListSehir.get(11));  Olmayan index elemanı RTE hatası verir.


    }


}

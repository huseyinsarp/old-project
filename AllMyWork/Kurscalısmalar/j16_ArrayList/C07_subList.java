package Kurscalısmalar.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> ListSehir = new ArrayList<>(List.of("LosAngeles", "Münih", "Stockholm",  "Londra"));
        // subList();  -->> Listenin istenen  List  parçasını return eder.
        System.out.println(ListSehir.subList(3, 5));

        System.out.println("listSehir.subList(3,5) = " + ListSehir.subList(3, 5));//3.4. index elemalnrı listi veririr [stockholm, Angara]

        ArrayList<String> city=new ArrayList<>(ListSehir.subList(2,5));//listSehir'den 2.3.4. index eelamnalrı city liste atandı.
        System.out.println("city = " + city);//city = [Londra, stockholm, Angara]


    }

}

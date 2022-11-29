package AllMyWork.Kurscalısmalar.j99_Lambda.lambdaSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        ciftKarePrint(sayi);
        System.out.println("\n********");
        tekKupBirFazlaPrint(sayi);
        System.out.println("\n********");
        ciftKareKokPrint(sayi);
        System.out.println("\n********");


    }  // main sonu

    //Task : "Functional Programming" kullanarak listin çift elemanlarının karelerini aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void ciftKarePrint (List<Integer> sayi) {
        sayi.
                stream().  // list elemanlar akışa alındı.
                filter(C01_LambdaExpression::ciftMi).  // akıştaki çift elemanlar filtrelendi.
                map(t->t*t).  // akışta filtrelenen çift elemanlar karesi alınarak update edildi akışa sokuldu.
                forEach(C01_LambdaExpression::yazdir);  // akışta filtrelenmiş çift elemanlar karşı alınıp işaretlenen akıştan print edildi.

    }

    //Task : "Functional Programming" kullanarak listin tek elemanlarının küplerin bir fazlasını aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void tekKupBirFazlaPrint (List<Integer> sayi) {
        sayi.
                stream().  // list elemanlar akışa alındı.
                filter(t->t%2==1).  // akıştaki çift elemanlar filtrelendi.
                // map(t->t*t*t+1).  // akışta filtrelenen tek elemanlar tüp +1 alınarak update edildi akışa sokuldu.
                        map(t->(int)Math.pow(t, 3)+1).
                forEach(C01_LambdaExpression::yazdir);  // akışta filtrelenmiş çift elemanlar karşı alınıp işaretlenen akıştan print edildi.

    }

    // Task : Functional Programming ile listin cift elemanlarinin karekoklerini ayni satirda aralarina bosluk birakarak print ediniz.


    public static void ciftKareKokPrint (List<Integer> sayi) {
        sayi.
                stream().  // list elemanlar akışa alındı.
                filter(C01_LambdaExpression::ciftMi).  // akıştaki çift elemanlar filtrelendi.
                        map(Math::sqrt).
                forEach(t->System.out.print(t+ " "));   // akışta filtrelenmiş çift elemanlar karşı alınıp işaretlenen akıştan print edildi.

    }


}

package AllMyWork.Kurscalısmalar.j99_Lambda.lambdaSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printCiftElemanStructured(sayi);
        System.out.println("\n********");
        printCiftElemanFunctional(sayi);
        System.out.println("\n********");
        printCiftElemanFunctional1(sayi);
        System.out.println("\n********");
        printCiftElemanFunctional2(sayi);
        System.out.println("\n********");



    } // main


    public static void printCiftElemanStructured (List<Integer> sayi) {  //amele method
        for (Integer w:sayi) {
            if (w%2==0) {
                System.out.print(w+" ");
            }
        }
    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElemanFunctional (List<Integer> sayi) {
        sayi.
                stream().  //List elemanları akışa alındı.
                filter(t->t%2==0).  // Akıştaki List elemanları çift olma şartına göre filtrelendi. Akıştan çıkarıldı.  -->> BAD PRACTİCE
                forEach(C01_LambdaExpression::yazdir);  // C01 Classtaki yazdir method refere (call) edildi.

    }


    public static void printCiftElemanFunctional1 (List<Integer> sayi) {
        sayi.
                stream().  //List elemanları akışa alındı.
                filter(C01_LambdaExpression::ciftMi).  // Akıştaki List elemanları çift olma şartına göre filtrelendi. Akıştan çıkarıldı.
                forEach(C01_LambdaExpression::yazdir);  // C01 Classtaki yazdir method refere (call) edildi.

    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 ten küçük çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.


    public static void printCiftElemanFunctional2 (List<Integer> sayi) {
        sayi.
                stream().  //List elemanları akışa alındı.
               // filter(C01_LambdaExpression::ciftMi).  // Akıştaki List elemanları çift olma şartına göre filtrelendi. Akıştan çıkarıldı.
                filter(a->a<35 && a %2==0).
                forEach(C01_LambdaExpression::yazdir);  // C01 Classtaki yazdir method refere (call) edildi.



        }
}
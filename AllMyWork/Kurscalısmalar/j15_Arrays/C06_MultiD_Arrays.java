package Kurscalısmalar.j15_Arrays;

import java.util.Arrays;

public class C06_MultiD_Arrays {
    public static void main(String[] args) {
        /*
      Çok Boyutlu Diziler
Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
 Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
 formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
 matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
 satır ve sütun sayısını girmemiz yeterli olacaktır.
* TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        // M.D. Array tanımlama
        int arr1[][] = new int[3][5]; // 3 satır, 5 sutün tablo veya 3 katlı ve her katta 5 dairesi bulunan apartman benzetmesi yapılabilir.

        // Bir sitede her birinde 10 daire
        //TRİCK: Array'ı uzunlukları ile tanımlamak için inner (daire) uzunlukları aynı olmalı.

        int Site[][][] = new int[6][8][10];

        // 24 kişilik 3 sınıf ve 21 kişilik 5 sınıf olan okul nasıl Array olarak tanımlanır.

        int sınıf24[][] = new int[3][24];  // 24 kişilik 3 sınıf
        int sınıf21[][] = new int[5][21];  // 21 kişilik 5 sınıf

        // Multi D. Array eleman ekleme....

        arr1[2][4] = 35;  // 2.kat 4. daire 35 olarak atandı.
        arr1[0][3] = 34;  // 0.kat 3. daire 34 olarak atandı.

        System.out.println(arr1[0][3]);

        // Elemanları girilerek Array tanımlama
        int arr[][] = {
                {1, 2, 3},  // 0. kat
                {10, 20}, // 1. kat
                {101} // 2. kat
        }; //3 katlı apt.


        // Array elemanları print etme
        System.out.println(arr[1]); //  Array toString olmadan doğrudan yazılmaz, yazılırsa referans değerini ([I@19dfb72a) verir.
        System.out.println(Arrays.toString(arr[1])); //[10, 20]
        System.out.println(arr[1][0]); //10
        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
        //  toString methodu outer methodu Stringe cevirir
        // outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin
        // referans degerlerini yazdirilir

        // MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.L
        System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [10, 20], [101]] şeklinde bütün Arrayları getirir.
        System.out.println(Arrays.toString(arr));


    }

}

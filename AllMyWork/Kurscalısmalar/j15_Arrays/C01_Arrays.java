package Kurscalısmalar.j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridi
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
        2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
        isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
         */
        //Array tanımlama
        int a; // declare edilen ama atanmayan primitive data
        int sayi [] ; // declare edilen ama atanmayan int type array
        // Tanımlanan array atama yapılmadan kullanılamaz.

        String isimArr [] = {"Muharrem, Enise, Cebrail, Nazım, Özge"}; // hem tanımlama hem atama yapılan String array
        int sayiArr [] = new int[5]; // java heap memory de 5 default değeri 0 olan int array create edildi.  [0, 0, 0, 0, 0]

        //Array'a eleman ekleme....
        sayiArr [2] =34;
        sayiArr [0] =35;
        sayiArr [1] =34;
        sayiArr [3] =61;
        sayiArr [0] =34;  // 0 index elamanı 34 değeri ile update edildi.
        //Array elemanları uniqe olmak zorunda değildir, tekrarlı array elemanı olabilir.

        // Array eleman sayısı boyut değeri...
        System.out.println("sayiArr.lenght =" + sayiArr.length);

        //Array son elemanı
        System.out.println("array son elemanı: " + isimArr[isimArr.length - 1]);  // Özge
        isimArr[isimArr.length-1]= "QA Özge Hanım"; //Array son elaman update edildi..

        //Arrayde olmayan eleman
        // OKKALI BİR İNTERVİEW SORUSU:   sayiArr[11] =23; cte vermez ama olmayan eleman rte verir. Array run timede oluşur.

        // Array elemanları print etme
        for (int i = 0; i < isimArr.length; i++) {
            System.out.println(isimArr[i] + " ");
        }
        System.out.println("isimArr = " + isimArr);
        System.out.println(Arrays.toString(isimArr)); // isimArray'ı String e çevrildi.

        // task -->> sayıArr elamanlarından değeri tek olanı print eden code create ediniz.
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]%2==0) {
                System.out.println(sayiArr[i] + " ");
            }

            // task -->> sayıArr çift index elamanları print eden code create ediniz.
          //  for (int i = 0; i < sayiArr.length; i+=2) {
                System.out.println(sayiArr[i] + " ");
            }

        // task-> isimArr 5 harfli elemanlarında oluşan arrayın  elemanlarını  print eden code create ediniz.

        int koltukSayısı = 0;
        //isimArr elemanı kadar boş yeni arr
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() == 5) {
                koltukSayısı++;//
            }
        }
        String yeniArr[] = new String[koltukSayısı];
        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < yeniArr.length; j++) {
                if (isimArr[i].length() == 5) {
                    yeniArr[j] = isimArr[i];
                }
            }
        }
        System.out.println(koltukSayısı);//2
        System.out.println(Arrays.toString(yeniArr));//

        //Array elemanları naturel(k->b:ascending b->k:descending, alfabetik) sıralama için sort(); method kulanılır
        System.out.println(Arrays.toString(isimArr));//sıarlama öncesi-> [muharrem, enise, cebrail, nazım, QA Özge hanım]
        Arrays.sort(isimArr);//isimArr elemanları naturel sıralama yapıldı
        System.out.println(Arrays.toString(isimArr));//sıralama sonrası -> [QA Özge hanım, cebrail, enise, muharrem, nazım]

        System.out.println(Arrays.toString(sayiArr));
        Arrays.sort(sayiArr);
        System.out.println(Arrays.toString(sayiArr));


    }
}





package Kurscalısmalar.j15_Arrays;

import java.io.BufferedReader;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        // Array elamanı varlığını kontrol etme

        int arr [] = {67, 97, 20, 63, 43, 34, 54, 24, 16, 7, 55, 17 };
        int sayi = 33;
        boolean flag = false;
        for (int i =0; i < arr.length; i++) {
            if (arr [i]==sayi) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Aradığınız sayı array içerisinde bulunmaktadır.");
        } else {
            System.out.println("Aradığınız sayı array içerisinde YOKTUR. ");
        }

        Arrays.sort(arr); // Array elemanları sıralandı
        System.out.println(Arrays.toString(arr));

        Arrays.binarySearch(arr, 34); // binarySearch(arr,34); aynısı var mı diye kontrol eder, varsa indexini verir
        System.out.println(Arrays.binarySearch(arr, 34));
        System.out.println(Arrays.binarySearch(arr, 21)); //Arrayda olmayan eleman çalışırsa sonuç olarak Arrayda kaçıncı SIRA'da olurdu cevabını verir.
        System.out.println(Arrays.binarySearch(arr, 17));
        System.out.println(Arrays.binarySearch(arr, 99));


    }

}

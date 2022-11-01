package Kurscalısmalar.j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        // Array eşitlik kontrolü.. equals() -->> index ve value kontrolü yapar ve true/false return eder.

        int sayi1 [] ={39, 3, 72, 63, 84};
        int sayi2 [] ={84,72, 63, 3, 39};

        System.out.println(Arrays.equals(sayi1, sayi2)); // false

        Arrays.sort(sayi1); // 39, 3, 72, 63, 84
        Arrays.sort(sayi2); // 39, 3, 72, 63, 84
        System.out.println(Arrays.equals(sayi1, sayi2)); // true -- sıralama işlemi yaptığımız için sonuç true aldık.

        //Array'i Stringe çevirme.. toString(arr); -->> verilen arr'i  String data type çevirir.

        String str = Arrays.toString(sayi1);
        System.out.println("str = " + str); //Array'ın tüm karakterleri String olarak tanımlandı. (Köşeli parantez, rakamlar, virgül... hepsi bir karakter)

        System.out.println(str.substring(6));


    }

}

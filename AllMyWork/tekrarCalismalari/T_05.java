package tekrarCalismalari;

import java.util.Scanner;

public class T_05 {
    public static void main(String[] args) {
        // İç içe if kullanımı:
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        Integer sayi = sc.nextInt();
        if (sayi >= 50) {
            System.out.println("50'ye eşit ya da büyük");
            if (sayi % 10 == 0)  {
                System.out.println("10'a tam bölünüyor.");
                if (sayi == 80) {
                    System.out.println("Sayı 80");
                }
            }
        }

     */

        // Ternary: Kodu birçok satırda yazmak yerine daha sade bir biçimde yazmamızı sağlar.
        int sayi = 75;
        String isim  = sayi > 50 ? (sayi > 80 ? "Ahmet" : "Mehmet") : ("Mustafa");
        System.out.println(isim);
        //*** İsim değişkenine değer ataması yapmak için ternary yardımı ile koşul içine koşul yerleştirebiliyoruz.
        // Eger sayı 50 'den büyük ise 1.parantez (Ahmet - Mehmet parantezi), değilse 2.parantez (Mustafa) parantezindeki değeri ata demektir.




    }
}

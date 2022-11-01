package tekrarCalismalari;

import java.util.Scanner;

public class T_03 {
    public static void main(String[] args) {
        // ıf - else : Eger bir koşul gerçekleşiyorsa if blogunun içerisi çalışır aksi durumda ise else bölümü çalışır.
      /*  int sayi =20;
        if (sayi >=50) {
            System.out.println("Sayı 50'ye eşit veya büyüktür");
        } else {
            System.out.println("Sayı 50'den küçüktür");
        }

        String cinsiyet = "Erkek";
        int yas = 20;

        if (cinsiyet.equals("Erkek")) {
            System.out.println("Cinsiyetiniz erkek");

        }
        if (yas >=20){
            System.out.println("Askere gidebilirsiniz.");
        } else {
            System.out.println("Kadin olduğunuz için askere  gidemezsiniz");
        }

       */
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        int ortalama = input.nextInt();
        if (ortalama >= 45){
            System.out.println("Dersi geçtiniz.");
        }
       if (ortalama <45) {
            System.out.println("Dersten kaldınız.");
        }
         */

        //Basit bir hesap makinesi
        Scanner hesap = new Scanner(System.in);
        System.out.println("İşlem seçiniz: ");
        String secim = hesap.next();

        System.out.println("ilk sayıyı giriniz:");
        int sayi1 = hesap.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int sayi2= hesap.nextInt();

        if (secim.equals("+")) {
            System.out.println("Toplam :" + (sayi1+sayi2));
            }
        if (secim.equals("-")) {
            System.out.println("Fark :" + (sayi1-sayi2));
        }
        if (secim.equals("*")) {
            System.out.println("Çarpım :" + (sayi1*sayi2));
        }
        if (secim.equals("/")) {
            System.out.println("Bölüm :" + (sayi1/sayi2));
        }
        if (secim.equals("%")) {
            System.out.println("Kalan :" + (sayi1%sayi2));
        }

















    }
}

package tekrarCalismalari;

import java.util.Scanner;

public class T_04 {
    public static void main(String[] args) {
        /**
         * if ile bir koşul oluşturuyoruz, koşulun içerisi true ise bu kod çalışıyor.
         * if şartı gerçekleşmezse sonrasında else if adında yeni bir koşul oluşturuyoruz. Else if'i istediğimiz kadar çoğaltabiliriz.
         * if ve else if çalışmazsa da her halükarda else koşulu çalışıyor.
         */

         /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi >0) {
            System.out.println("Sayı pozitif");
        } else if (sayi < 0) {
            System.out.println("Sayi negatif");
        }
        else {
            System.out.println("Sayı 0'a eşit");
        }
         */
        /*
        Scanner days = new Scanner(System.in);
        System.out.println("Lütfen bir gün yazınız: ");
       String gun =days.next();
                if(gun.equals("Pazar")) {
                    System.out.println("Pazar günündesiniz.");
                }
                else if (gun.equals("Cumartesi")) {
                    System.out.println("Cumartesi günündesiniz");
                } else {
                    System.out.println("Haftaiçindesiniz.");
                }
                */
        String cinsiyet = "Erkek";
        int yas = 25;
        if (yas >= 20 && cinsiyet.equals("Erkek")) {
            System.out.println("Askere gidebilirsiniz.");
            System.out.println("Cinsiyet: "+ cinsiyet);
            System.out.println("Yaş: "+ yas);
        } else {
            System.out.println("Askere gidemezsiniz.!!");
        }










    }
}

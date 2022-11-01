package tekrarCalismalari;

import java.util.Scanner;

public class T_06_SwitchCase {
    public static void main(String[] args) {
        /*
        If - else yapısına benzer.
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1'den 7'ye kadar rakam giriniz: ");
        int gun = sc.nextInt();
        if (gun == 1){
            System.out.println("Pazartesi");
        } else if (gun == 2) {
            System.out.println("Salı");
        }else if (gun == 3) {
            System.out.println("Çarşamba");
        }else if (gun == 4) {
            System.out.println("Perşembe");
        }else if (gun == 5) {
            System.out.println("Cuma");
        }else if (gun == 6) {
            System.out.println("Cumartesi");
        }else if (gun == 7) {
            System.out.println("Pazar");
        } else {
            System.out.println("Hatalı giriş yaptınız. Lütfen 1'den 7'ye kadar rakam giriniz.");
        }

         */ //Bu kadar uzun yazmaktansa Switch Case ile sade bir şekilde yazabiliriz.
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1'den 7'ye kadar rakam giriniz: ");
        int gun = sc.nextInt();
        switch (gun) {
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Lütfen 1'den 7'ye kadar rakam giriniz. ");
        } // If - else'den farkı ihtimallerin belirli olduğu zamanlarda kullanılır. Switch Case'de durum var, if -else'de koşul(lar) var.
        // ıf else'de birçok koşulu aynı satırda yazabiliyorken switch casede bir satıra  sadece bir durumu yazabiliriz.






    }


}

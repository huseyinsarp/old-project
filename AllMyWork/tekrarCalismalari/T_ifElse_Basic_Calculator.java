package tekrarCalismalari;

import java.util.Scanner;

public class T_ifElse_Basic_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz ifadeyi giriniz: ");
        String islem = sc.nextLine();

        System.out.println("Lütfen 1.sayıyı giriniz : ");
        int sayi1 = sc.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz : ");
        int sayi2 = sc.nextInt();

        if (islem.equals("+")) {
            System.out.println("Toplam: " + (sayi1 + sayi2));
        }
        if (islem.equals("-")) {
            System.out.println("Fark: " + (sayi1 - sayi2));
        }
        if (islem.equals("*")) {
            System.out.println("Çarpım: " + (sayi1 * sayi2));
        }
        if (islem.equals("/")) {
            System.out.println("Bölüm: " + (sayi1 / sayi2));
        }
        else {
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz. ");
        }




    }

}

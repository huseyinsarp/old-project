package Kurscalısmalar.j13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // task -->> String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen pin giriniz: ");
        String dogruPin = "javaCAN";

        int girisHakki = 3;
        while (true) {
          String yeniPin = sc.nextLine();
            if (yeniPin.equals(dogruPin)) {
                System.out.println("Girdiğiniz pin DOĞRU");
                break;
            }else {
                System.out.println("Hatalı pin girdiniz");
                girisHakki--;
                System.out.println(girisHakki + " hakkınız kaldı.");
                if (girisHakki== 0) {
                    System.out.println("Hesabınız kilitlenmiştir. ");
                }
            }
        }




    }

}

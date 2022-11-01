package Kurscalısmalar.j12_Loop.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //Girilen iki sayı arasındaki 2 ile tam bölünen sayıları print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int sayi1 = sc.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        int sayi2 = sc.nextInt();


        if (sayi1 < sayi2) {
            for (int i = sayi1; i < sayi2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + "");
                }
            }

        } else System.out.println("Hatalı giriş yaptınız !!!!");



    } // main sonu

}


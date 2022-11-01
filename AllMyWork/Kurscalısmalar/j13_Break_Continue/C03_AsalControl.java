package Kurscalısmalar.j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {

        // Girilen tamsayının asal olup olmadığını kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int sayi = sc.nextInt();
        int deger =0;

        for (int i =2; i<sayi; i++) {
            if (sayi%i==0)  {
                deger++;
            }
        }
        if (deger==0) {
            System.out.println(sayi + " Belirtilen sayı asaldır.");
        } else System.out.println(sayi + " Asal sayı değildir. ");

        /*
        12. satırdan sonra devamla başka bir çözüm yöntemi

         boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0) {
                asalMi =false;
                break;
            }
        }
        if (asalMi) {
            System.out.println("Girilen sayı ASAL");
        } else
            System.out.println("Girilen sayı asal DEĞİL");

         */




    }

}

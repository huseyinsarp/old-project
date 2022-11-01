package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1.vize notunuzu giriniz: ");
        float ilkVize = sc.nextFloat();

        System.out.println("Lütfen 2.vize notunuzu giriniz: ");
        float ikinciVize = sc.nextFloat();

        double vize = (ilkVize + ikinciVize)/2 * 0.3;

        System.out.println("Lütfen final notunuzu giriniz: ");
        double finall = sc.nextDouble();
        finall = finall*0.7;

        double notOrtalaması = finall + vize;
        System.out.println("Not ortalamanız : " + notOrtalaması + "dir.");




    }
}

package Kurscalısmalar.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _03_if_statement3 {

    public static void main(String[] args) {

    /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz.");
        int str1 = sc.nextInt();

        System.out.println("Lütfen 2.sayıyı giriniz.");
        int str2 = sc.nextInt();
        if (str1 > str2) {
            System.out.println("str1 str2'den BÜYÜKTÜR");
        }
        if (str2 > str1) {
            System.out.println("str2 str1'den BÜYÜKTÜR");
        }



    }
}

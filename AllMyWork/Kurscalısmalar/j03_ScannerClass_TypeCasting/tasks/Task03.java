package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen günde kaç saat uyuduğunuzu giriniz: ");
        float uyku = sc.nextFloat();

        float ay = uyku*30;

        float sene = ay*12;

        float sene40 = sene*40;

        System.out.println("1 ayda uykuda geçirdiğiniz süre " + ay + " saattir.\n "
        + "1 yılda uykuda geçirdiğiniz süre " + sene + " saattir.\n"
        + "40 yılda uykuda geçirdiğiniz süre " + sene40 + "saattir.");



    }
}

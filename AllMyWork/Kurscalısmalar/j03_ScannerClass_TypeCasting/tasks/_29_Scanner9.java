package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class _29_Scanner9 {

    public static <ınt> void main(String[] args) {

    /*   kullanıcının boyunu
          Float print eden code create ediniz   */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz: ");
        float boy = sc.nextFloat();
        float sonuc = boy/100;
        System.out.println("Boyunuz " + sonuc + "cm dir.");




    }


}

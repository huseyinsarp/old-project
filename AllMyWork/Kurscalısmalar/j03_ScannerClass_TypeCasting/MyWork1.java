package Kurscalısmalar.j03_ScannerClass_TypeCasting;

import javax.sound.midi.SysexMessage;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class MyWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz: ");
        String isim = sc.nextLine();
        System.out.println("İsminiz: " + isim.toUpperCase());

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunluğunu giriniz: ");
        int kenar = scan.nextInt();
        System.out.println("Karenin çevre uzunluğu : " + kenar*4 + "dir.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen günlük içtiğiniz çay sayısını griniz: ");
        float seker = 1.7f;
        int cay = scanner.nextInt();
        float sonuc = cay*seker*365/1000;
        System.out.println("1 yılda tükettiğiniz şeker miktarı: "+ sonuc + " kilogramdır.");








    } // main sonu

}

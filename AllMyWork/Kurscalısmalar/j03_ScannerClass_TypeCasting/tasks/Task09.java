package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        double ilkSayi = sc.nextDouble();

        System.out.println("2.sayıyı giriniz: ");
        double ikinciSayi = sc.nextDouble();

        System.out.println("3.sayıyı giriniz: ");
        double ucuncuSayi = sc.nextDouble();

        double sonuc = (ilkSayi*ilkSayi) - (ikinciSayi*ikinciSayi) /3*ucuncuSayi;
        System.out.println("İşleminizin sonucu : " + sonuc);






    }
}

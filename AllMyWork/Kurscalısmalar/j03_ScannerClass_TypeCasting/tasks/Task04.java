package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz:");
        String isim =sc.nextLine();
        System.out.println(" Lütfen soyisminizi giriniz:");
        String soyisim =sc.nextLine();

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = sc.nextInt();

        System.out.println("Lütfen kilonuzu  giriniz: ");
        int kilo = sc.nextInt();

        System.out.println("Lütfen boyunuzu giriniz: ");
        int boy = sc.nextInt();

        System.out.println("Lütfen salona devam edeceğiniz ay sayısını giriniz: ");
        int ay = sc.nextInt();
        int ucret = ay*10;

        System.out.println("İsminiz: " + isim  +  soyisim+"\nYaşınız: " + yas + "\nKilonuz: "+ kilo +  "\nBoyunuz: " + boy );
        System.out.println("Salona ödeyeceğiniz toplam ücret : " + ucret + "$'dir.");











    }
}

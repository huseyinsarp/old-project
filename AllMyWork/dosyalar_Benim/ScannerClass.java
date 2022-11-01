package dosyalar_Benim;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = sc.next();
        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas = sc.nextInt();
        System.out.println("İsminiz: " + isim.toUpperCase() + "\nYaşınız: " + yas);
    }

}

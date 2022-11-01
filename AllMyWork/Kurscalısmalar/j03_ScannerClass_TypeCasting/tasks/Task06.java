package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 1.kenar uzunluğunu giriniz: ");
        int ilkKenar = sc.nextInt();

        System.out.println("Lütfen 2.kenar uzunluğunu giriniz: ");
        int ikinciKenar = sc.nextInt();

        int hipotenus = ilkKenar*ikinciKenar;
        System.out.println("Hipotenüs =" + hipotenus + "cm'dir.");





    }
}

package Kurscalısmalar.j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen gitmek istediğiniz mesafeyi giriniz: ");
        float mesafe = sc.nextFloat();

        System.out.println("Lütfen hızınızı giriniz: ");
        float hiz = sc.nextFloat();

        float sure = mesafe / hiz;
        System.out.println("Varış noktasına " + sure + "saatte ulaşabilirsiniz.");
        System.out.println("Siz ve sevdikleriniz için trafik kurallarına uyalım. :) ");





    }
}

package dosyalar_Benim;

import java.util.Scanner;

public class OrnekCalisma2 {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz: ");
        String ad = pc.next();

        System.out.println("Lütfen doğum tarihinizi giriniz: ");
        Integer yas = pc.nextInt();

        System.out.println("Lütfen okulunuzun adını giriniz:");
        String okul = pc.next();

        System.out.println("Lütfen ayakkabı numaranızı giriniz: ");
        Integer shoes = pc.nextInt();

       /* System.out.println("Adınız: " + ad);
        System.out.println("Doğum tarihiniz: "+ yas);
        System.out.println("Öğrenim gördüğünüz okulunuz: "+ okul);
        System.out.println("Ayakkabı numaranız: "+ shoes);
        ***Böyle yapabileceğimiz gibi daha kısa haliyle aşağıdaki gibi yazdırabiliriz.
        */

        System.out.println("Adınız:"+ ad + "\nYaşınız: "+ yas + "\nOkulunuz: "+ okul + "\nAyakkabı numaranız: " + shoes);




    }
}

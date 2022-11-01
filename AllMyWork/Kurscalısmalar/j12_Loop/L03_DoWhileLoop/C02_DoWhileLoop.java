package Kurscalısmalar.j12_Loop.L01_ForLoop.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
    // Girilen sayı 17'den küçük ise kazandınız, büyük ise kaybettiniz print eden do while loop code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int sayi=sc.nextInt() ;


        do {

            System.out.println(sayi + "Kazandınız.!!");
            sayi++;
        } while (sayi<17);
        System.out.println("Kaybettiniz...:( ");




    }// main sonu

}

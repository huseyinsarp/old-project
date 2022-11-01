package Kurscalısmalar.j12_Loop.L01_ForLoop.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        //Girilen tamsayının rakamları toplamını print eden method create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = sc.nextInt();
        System.out.println(rakamTopla(sayi)); // method call

    } // main sonu

    private static int  rakamTopla(int sayi) {

        int rakamToplamı =0;
        while (sayi>0) { // sayı 1 olana deek body action çalış.
            rakamToplamı+=sayi%10; // Sayının birler basamağı rakamToplamı na eklendi.
            sayi/=10; // sayı 1 basamak eksiltildi.


        }
        return rakamToplamı;
    }

}

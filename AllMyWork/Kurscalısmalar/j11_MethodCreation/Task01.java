package AllMyWork.Kurscalısmalar.j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen 2 sayının eşitliğini kontrol eden method create ediniz.
        System.out.println("Lütfen ilk sayıyı giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi1 = sc.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz");
        int sayi2 = sc.nextInt();
        System.out.println(esitKontrol(sayi1, sayi2));
        System.out.println(esitKontrol(3, 5));
        System.out.println(esitKontrol(33, 33));
        esitKontrol2 (56, 67);
        esitKontrol2(61,61);
        esitKontrol2(sayi1, sayi2);





    }

    private static boolean esitKontrol (int sayi1, int sayi2) {
        boolean esitMi = false;
        if (sayi1 == sayi2) {
            esitMi = true;
        } else esitMi = false;
        return esitMi;
    }

    public static void esitKontrol2 (int a, int b) {
        if (a == b) {
            System.out.println("ağam sayılar EŞİT :) ");
        } else System.out.println("ağam sayılar eşit DEĞİL :(");
    }




}

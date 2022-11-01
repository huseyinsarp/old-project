package tekrarCalismalari;

import java.util.Scanner;

public class BodyHealthİndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        double kilo = sc.nextDouble();

        System.out.println("Boyunuzu giriniz: ");
        double boy = sc.nextDouble();

        double vucutKitleEndeksi = kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz: " +vucutKitleEndeksi);


    }


}
